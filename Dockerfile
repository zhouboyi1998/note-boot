FROM java:8
LABEL maintainer="zhouboyi<1144188685@qq.com>"

WORKDIR /kotlin/note-boot
COPY ./target/note-boot-0.0.1-SNAPSHOT.jar /kotlin/note-boot/note-boot-0.0.1-SNAPSHOT.jar

EXPOSE 18092
ENTRYPOINT ["java", "-jar", "note-boot-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]
