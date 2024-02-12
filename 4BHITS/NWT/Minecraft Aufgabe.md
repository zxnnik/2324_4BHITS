
#NWT 
### Setup
Ubuntu

##### Java installieren
sudo apt install openjdk-17-jre-headless 

##### full-screen window manager um Server laufen zu lassen, wenn das terminal geschlossen wird
sudo apt install screen
##### TCP Port 25565
sudo ufw allow 25565
# Make server folder
mkdir server

##### Minecraft Java Edition Server runterladen
wget https://piston-data.mojang.com/v1/objects/8dd1a28015f51b1803213892b50b7b4fc76e594d/server.jar

##### Server starten (im install window manager screen)
End User License Agreement akzeptieren:
eula.txt mithilfe von nano öffnen und "eula" auf true setzen
sudo java -Xms1G -Xmx2G -jar server.jar nogui

### Server-Konfiguration


```

2.  **Change SSH-Server port**
   
```bash
# Open ssh config file and edit port
sudo nano /etc/ssh/sshd_config
port=25566

# Reload SSH Server settings
sudo service ssh reload

# Check connection on the new port
ssh -p 25566 ubuntu@192.168.132.11

# Update firewall config
sudo iptables -A INPUT -p tcp --dport 25566 -j ACCEPT
```

3. **Only allow access from local network**
   
```bash
# server.properties file
# input local ip
server-ip=192.168.132.11

# Block port on firewall
sudo iptables -A INPUT -p tcp --dport 25565 -j DROP
```
Optionally disable Port-forwarding on your router

4.  **Add user "minecraft" to start server**

```bash
# Create user "minecraft" without home directory / without login shell
sudo adduser --system --no-create-home --group 

# Switch user and copy server files to new user
su - minecraft
cd ~
cp -r ~/server

# Create startup script
nano start.sh
"""
#!/bin/bash
java -Xmx1G -Xms1G -jar server.jar nogui
"""

	# Add permissions
chmod +x start.sh
```

Server start example:
```bash
su - minecraft
./start.sh
```