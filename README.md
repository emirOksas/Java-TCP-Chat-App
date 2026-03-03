# Java TCP Client-Server Chat Application

Bu proje, Java Socket Programlama kullanılarak geliştirilmiş çok kanallı (multi-threaded) bir TCP istemci-sunucu sohbet uygulamasıdır. Bilgisayar ağları ve TCP/IP protokolü prensiplerini pratiğe dökmek amacıyla tasarlanmıştır.

## Özellikler
* **TCP/IP İletişimi:** Veri iletimi için güvenilir TCP protokolü kullanılmıştır.
* **Multi-threading:** Sunucu, `java.lang.Thread` sınıfını kullanarak aynı anda birden fazla istemciye (client) hizmet verebilir.
* **Broadcast Mesajlaşma:** Bir istemciden gelen mesaj, sunucuya bağlı tüm istemcilere eş zamanlı olarak iletilir.

## Teknolojiler
* Java (java.net.Socket, java.net.ServerSocket)
* I/O Streams (BufferedReader, PrintWriter)
* Threading ve Senkronizasyon (Synchronized blocks)

## Nasıl Çalıştırılır?

1. Kodları derleyin:
   `javac Server.java Client.java`
2. İlk olarak bir terminalde sunucuyu başlatın:
   `java Server`
3. Farklı terminallerde istemcileri başlatın (Localhost için IP adresi 127.0.0.1):
   `java Client 127.0.0.1`
