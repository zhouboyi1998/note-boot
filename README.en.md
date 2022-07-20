<h1 align="center">📔 note-boot</h1>

<p align="center">
<a target="_blank" href="https://github.com/zhouboyi1998/note-boot"> 
<img src="https://img.shields.io/github/stars/zhouboyi1998/note-boot?logo=github">
</a>
<a target="_blank" href="https://opensource.org/licenses/MIT"> 
<img src="https://img.shields.io/badge/license-MIT-red"> 
</a>
<img src="https://img.shields.io/badge/JDK-1.8-darkcyan"> 
<img src="https://img.shields.io/badge/Kotlin-1.6.21-orange"> 
<img src="https://img.shields.io/badge/Spring Boot-2.7.0-brightgreen">
<img src="https://img.shields.io/badge/Spring Data-2.7.0-brightgreen">
</p>

### 📖 Language

[简体中文](./README.md) | English

### 🐳 Docker

* Run the command in the project root directory

#### Maven Package

```
mvn clean package -DskipTests
```

#### Docker Build

```
docker build -t note-boot .
```

#### Docker Run

```
docker run -d -p 18092:18092 --name note-boot note-boot
```

### 📜 Licence

[MIT License](https://opensource.org/licenses/MIT) Copyright (c) 2022 周博义
