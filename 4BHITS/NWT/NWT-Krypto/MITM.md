---
tags: NWT
---
```bash
ncat socket.cryptohack.org 13371
Intercepted from Alice: {"p": "0xffffffffffffffffc90fdaa22168c234c4c6628b80dc1cd129024e088a67cc74020bbea63b139b22514a08798e3404ddef9519b3cd3a431b302b0a6df25f14374fe1356d6d51c245e485b576625e7ec6f44c42e9a637ed6b0bff5cb6f406b7edee386bfb5a899fa5ae9f24117c4b1fe649286651ece45b3dc2007cb8a163bf0598da48361c55d39a69163fa8fd24cf5f83655d23dca3ad961c62f356208552bb9ed529077096966d670c354e4abc9804f1746c08ca237327ffffffffffffffff", "g": "0x02", "A": "0xdf6da5d02386f9609039cd1b929ea67cbe9f682a76055a8a81d6ebdf23c54fbffa36924b527e917e42cd71703b1ca1c257b9458477d15149e77e0b773a0e8c25636e90134ee31eaa93cb6a6a1b7e8d4f224bddaba7d9a940b2b4cc3e8fbfc8f2dc661cf5325927d993b649aa2600f374c5e219c187f465265c03a5615be1ae4cea3423b0a9c24745c0eec7c81bfc0ed07bebb29926f3664afbccd1aea07b101ff1b32351e3f9646870cd4ff3f736e49509e58d8e79bba0fbfe32a2930cd2122b"}
Send to Bob: {"p": "0xffffffffffffffffc90fdaa22168c234c4c6628b80dc1cd129024e088a67cc74020bbea63b139b22514a08798e3404ddef9519b3cd3a431b302b0a6df25f14374fe1356d6d51c245e485b576625e7ec6f44c42e9a637ed6b0bff5cb6f406b7edee386bfb5a899fa5ae9f24117c4b1fe649286651ece45b3dc2007cb8a163bf0598da48361c55d39a69163fa8fd24cf5f83655d23dca3ad961c62f356208552bb9ed529077096966d670c354e4abc9804f1746c08ca237327ffffffffffffffff", "g": "0x02", "A": "345676543456787654" }
Intercepted from Bob: {"B": "0xb9e0517ce4298d836371239104038df6bbb60e44dd9217ffd39454a98c8cff0a7c2f998e46db4ca35b9afc2d67a5ca8a29e3e728a3422bac5dcb7b5e0c92b968f7afa6b9dd0de64d6cfd423a2596eeb6f2f09929c125ad966b7480e08960b16af79b36c4c0c9095665cf18d0ab4ca534f785787620cfb303f9f30e73231b68b613202cda4945087638b4bae805403b1c7c9415425beef2cb68e753c3282a14b7ab4652f1d033e81be2fc21e9badea874e4cce96f5ed10ba019f599ef4fc148f6"}
Send to Alice: {"B": "345676543456787654"}
Intercepted from Alice: {"iv": "d452d088f31fc9d4fd32c4b147e1d47e", "encrypted_flag": "76dd24c7dbb39f1f2ef2e7f4fb71b31fbf389ae5928bb891a92a8569ee542978"}>)
```

Decrypt
```python
from Crypto.Cipher import AES  
from Crypto.Util.Padding import pad, unpad  
import hashlib  
  
  
def is_pkcs7_padded(message):  
    padding = message[-message[-1]:]  
    return all(padding[i] == len(padding) for i in range(0, len(padding)))  
  
  
def decrypt_flag(shared_secret: int, iv: str, ciphertext: str):  
    # Derive AES key from shared secret  
    sha1 = hashlib.sha1()  
    sha1.update(str(shared_secret).encode('ascii'))  
    key = sha1.digest()[:16]  
    # Decrypt flag  
    ciphertext = bytes.fromhex(ciphertext)  
    iv = bytes.fromhex(iv)  
    cipher = AES.new(key, AES.MODE_CBC, iv)  
    plaintext = cipher.decrypt(ciphertext)  
  
    if is_pkcs7_padded(plaintext):  
        return unpad(plaintext, 16).decode('ascii')  
    else:  
        return plaintext.decode('ascii')  
  
  
shared_secret = 0xdf6da5d02386f9609039cd1b929ea67cbe9f682a76055a8a81d6ebdf23c54fbffa36924b527e917e42cd71703b1ca1c257b9458477d15149e77e0b773a0e8c25636e90134ee31eaa93cb6a6a1b7e8d4f224bddaba7d9a940b2b4cc3e8fbfc8f2dc661cf5325927d993b649aa2600f374c5e219c187f465265c03a5615be1ae4cea3423b0a9c24745c0eec7c81bfc0ed07bebb29926f3664afbccd1aea07b101ff1b32351e3f9646870cd4ff3f736e49509e58d8e79bba0fbfe32a2930cd2122b  
iv = "d452d088f31fc9d4fd32c4b147e1d47e"  
ciphertext = "76dd24c7dbb39f1f2ef2e7f4fb71b31fbf389ae5928bb891a92a8569ee542978"  
  
print(decrypt_flag(shared_secret, iv, ciphertext))
```
gibt crypto{n1c3_0n3_m4ll0ry!!!!!!!!} aus