package dicoding;

public class Dicoding {

    public static void main(String[] args) {
        LearningPath machineLearningDeveloper = new LearningPath();

        Academy belajarDasarVisualisasiData = new Academy();
        Academy memulaiPemrogramanDenganPython = new Academy();
        Academy belajarMachineLearningUntukPemula = new Academy();
        Academy belajarPengembanganMachineLearning = new Academy();

        LearningPath androidDeveloper = new LearningPath();

        Academy memulaiPemrogramanDenganKotlin = new Academy();
        Academy belajarPrinsipPemrogramanSOLID = new Academy();
        Academy belajarMembuatAplikasiAndroidUntukPemula = new Academy();
        Academy belajarFundamentalAplikasiAndroid = new Academy();
        Academy belajarAndroidJetpackPro = new Academy();
        Academy menjadiAndroidDeveloperExpert = new Academy();

        LearningPath iOSDeveloper = new LearningPath();

        Academy memulaiPemrogramanDenganSwift = new Academy();
        Academy belajarMembuatAplikasiIOSUntukPemula = new Academy();
        Academy belajarFundamentalAplikasiIOS = new Academy();
        Academy menjadiIOSDeveloperExpert = new Academy();

        LearningPath frontEndWebDeveloper = new LearningPath();

        Academy belajarDasarPemrogramanWeb = new Academy();
        Academy belajarFundamentalFrontEndWebDevelopment = new Academy();
        Academy menjadiFrontEndWebDeveloperExpert = new Academy();

        LearningPath backEndDeveloper = new LearningPath();

        Academy belajarDasarAWSCloud = new Academy();
        Academy belajarDasarPemrogramanJavaScript = new Academy();
        Academy belajarMembuatAplikasiBackEndUntukPemula = new Academy();
        Academy membangunArsitekturAWSDiCloud = new Academy();
        Academy belajarFundamentalAplikasiBackEnd = new Academy();
        Academy menjadiBackEndDeveloperExpert = new Academy();

        LearningPath azureCloudDeveloper = new LearningPath();

        Academy belajarDasarDasarAzureCloud = new Academy();
        Academy menjadiAzureCloudDeveloper = new Academy();

        LearningPath multiPlatformAppDeveloper = new LearningPath();

        Academy memulaiPemrogramanDenganDart = new Academy();
        Academy belajarMembuatAplikasiFlutterUntukPemula = new Academy();
        Academy belajarFundamentalAplikasiFlutter = new Academy();
        Academy menjadiFlutterDeveloperExpert = new Academy();

        // Machine Learning Developer
        machineLearningDeveloper.setName("Machine Learning Developer");
        machineLearningDeveloper.setDescription("Kurikulum lengkap yang disusun oleh dicoding.Dicoding bersama IBM dan Google beserta pelaku industri. Siswa dipersiapkan untuk menjadi Machine Learning Developer sesuai standar kebutuhan industri.");
        machineLearningDeveloper.setClassAcademy(4);

        belajarDasarVisualisasiData.setStep(1);
        belajarDasarVisualisasiData.setName("Belajar Dasar Visualisasi Data");
        belajarDasarVisualisasiData.setDescription("Pelajari teknik dasar untuk representasi hasil secara visual sehingga dapat menceritakan dan mempresentasikan data secara efektif.");
        belajarDasarVisualisasiData.setLevel("Dasar");
        belajarDasarVisualisasiData.setTime(16);
        belajarDasarVisualisasiData.setTechnology("Data, Machine Learning");

        memulaiPemrogramanDenganPython.setStep(2);
        memulaiPemrogramanDenganPython.setName("Memulai Pemrograman Dengan Python");
        memulaiPemrogramanDenganPython.setDescription("Belajar Python yang menjadi landasan penting berbagai tren industri seperti ilmu data, pemelajaran mesin, dan manajemen infrastruktur.");
        memulaiPemrogramanDenganPython.setLevel("Dasar");
        memulaiPemrogramanDenganPython.setTime(20);
        memulaiPemrogramanDenganPython.setTechnology("Data, Machine Learning");

        belajarMachineLearningUntukPemula.setStep(3);
        belajarMachineLearningUntukPemula.setName("Belajar Machine Learning untuk Pemula");
        belajarMachineLearningUntukPemula.setDescription("Pelajari materi dasar pengembangan machine learning dan langkah menciptakan model machine learning pertamamu untuk memproses data.");
        belajarMachineLearningUntukPemula.setLevel("Pemula");
        belajarMachineLearningUntukPemula.setTime(30);
        belajarMachineLearningUntukPemula.setTechnology("Machine Learning");

        belajarPengembanganMachineLearning.setStep(4);
        belajarPengembanganMachineLearning.setName("Belajar Pengembangan Machine Learning");
        belajarPengembanganMachineLearning.setDescription("Pelajari implementasi machine learning pada industri mulai dari computer vision, natural language, serta deployment proyek machine learning.");
        belajarPengembanganMachineLearning.setLevel("Menengah");
        belajarPengembanganMachineLearning.setTime(40);
        belajarPengembanganMachineLearning.setTechnology("Machine Learning");

        // Android Developer
        androidDeveloper.setName("Android Developer");
        androidDeveloper.setDescription("Kurikulum didesain oleh dicoding.Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia. Siswa dipersiapkan untuk menjadi Android Developer berstandar global Google.");
        androidDeveloper.setClassAcademy(6);

        memulaiPemrogramanDenganKotlin.setStep(1);
        memulaiPemrogramanDenganKotlin.setName("Memulai Pemrograman Dengan Kotlin");
        memulaiPemrogramanDenganKotlin.setDescription("Kelas pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming (OOP) menggunakan Kotlin.");
        memulaiPemrogramanDenganKotlin.setLevel("Dasar - Pemula");
        memulaiPemrogramanDenganKotlin.setTime(50);
        memulaiPemrogramanDenganKotlin.setTechnology("Android, Multi Platform");

        belajarPrinsipPemrogramanSOLID.setStep(2);
        belajarPrinsipPemrogramanSOLID.setName("Belajar Prinsip Pemrograman SOLID");
        belajarPrinsipPemrogramanSOLID.setDescription("Pelajari kelima prinsip desain yang merupakan pedoman untuk rancangan kode yang baik pada pemrograman berorientasi objek (OOP).");
        belajarPrinsipPemrogramanSOLID.setLevel("Dasar");
        belajarPrinsipPemrogramanSOLID.setTime(15);
        belajarPrinsipPemrogramanSOLID.setTechnology("Android, iOS, Multi Platform, Web");

        belajarMembuatAplikasiAndroidUntukPemula.setStep(3);
        belajarMembuatAplikasiAndroidUntukPemula.setName("Belajar Membuat Aplikasi Android untuk Pemula");
        belajarMembuatAplikasiAndroidUntukPemula.setDescription("Pelajari cara membuat aplikasi pertamamu dengan Android Studio. Kelas ini mengajarkan dasar Android mulai dari Intent sampai RecyclerView.");
        belajarMembuatAplikasiAndroidUntukPemula.setLevel("Pemula");
        belajarMembuatAplikasiAndroidUntukPemula.setTime(40);
        belajarMembuatAplikasiAndroidUntukPemula.setTechnology("Android");

        belajarFundamentalAplikasiAndroid.setStep(4);
        belajarFundamentalAplikasiAndroid.setName("Belajar Fundamental Aplikasi Android");
        belajarFundamentalAplikasiAndroid.setDescription("Pelajari skill Android dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan. Mulai dari design pattern, testing, API sampai database.");
        belajarFundamentalAplikasiAndroid.setLevel("Menengah");
        belajarFundamentalAplikasiAndroid.setTime(150);
        belajarFundamentalAplikasiAndroid.setTechnology("Android");

        belajarAndroidJetpackPro.setStep(5);
        belajarAndroidJetpackPro.setName("Belajar Android Jetpack Pro");
        belajarAndroidJetpackPro.setDescription("Pelajari Android Jetpack dengan berbagai fitur canggih dan sudah diimplementasikan 80% dari 1000 aplikasi terbaik di Google Play Store.");
        belajarAndroidJetpackPro.setLevel("Mahir");
        belajarAndroidJetpackPro.setTime(70);
        belajarAndroidJetpackPro.setTechnology("Android");

        menjadiAndroidDeveloperExpert.setStep(6);
        menjadiAndroidDeveloperExpert.setName("Menjadi Android Developer Expert");
        menjadiAndroidDeveloperExpert.setDescription("Saatnya menjadi Android Expert dengan belajar Clean Architecture, Reactive, Dependency Injection, Modularization, Performance, dan Security.");
        menjadiAndroidDeveloperExpert.setLevel("Profesional");
        menjadiAndroidDeveloperExpert.setTime(90);
        menjadiAndroidDeveloperExpert.setTechnology("Android");

        // iOS Developer
        iOSDeveloper.setName("iOS Developer");
        iOSDeveloper.setDescription("Kurikulum disusun oleh dicoding.Dicoding dan pelaku industri di bidang iOS Development. Siswa dipersiapkan untuk menjadi iOS Developer sesuai standar kebutuhan industri.");
        iOSDeveloper.setClassAcademy(5);

        memulaiPemrogramanDenganSwift.setStep(1);
        memulaiPemrogramanDenganSwift.setName("Memulai Pemrograman Dengan Swift");
        memulaiPemrogramanDenganSwift.setDescription("Belajar bahasa Swift buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) dalam mengembangkan iOS dan OS X.");
        memulaiPemrogramanDenganSwift.setLevel("Dasar");
        memulaiPemrogramanDenganSwift.setTime(40);
        memulaiPemrogramanDenganSwift.setTechnology("iOS");

        belajarMembuatAplikasiIOSUntukPemula.setStep(3);
        belajarMembuatAplikasiIOSUntukPemula.setName("Belajar Membuat Aplikasi iOS untuk Pemula");
        belajarMembuatAplikasiIOSUntukPemula.setDescription("Pelajari cara membuat aplikasi pertamamu dengan Xcode. Kelas ini mengajarkan dasar iOS mulai dari Controller sampai TableViews.");
        belajarMembuatAplikasiIOSUntukPemula.setLevel("Pemula");
        belajarMembuatAplikasiIOSUntukPemula.setTime(40);
        belajarMembuatAplikasiIOSUntukPemula.setTechnology("iOS");

        belajarFundamentalAplikasiIOS.setStep(4);
        belajarFundamentalAplikasiIOS.setName("Belajar Fundamental Aplikasi iOS");
        belajarFundamentalAplikasiIOS.setDescription("Pelajari komponen fundamental iOS berdasarkan teknik yang digunakan industri mulai dari App Design, SwiftUI, Networking, sampai Database.");
        belajarFundamentalAplikasiIOS.setLevel("Menengah");
        belajarFundamentalAplikasiIOS.setTime(70);
        belajarFundamentalAplikasiIOS.setTechnology("iOS");

        menjadiIOSDeveloperExpert.setStep(5);
        menjadiIOSDeveloperExpert.setName("Menjadi iOS Developer Expert");
        menjadiIOSDeveloperExpert.setDescription("Saatnya jadi iOS Expert dengan belajar Clean Architecture, Reactive, Dependency Injection, Modularization, dan Test Driven Development.");
        menjadiIOSDeveloperExpert.setLevel("Mahir - Profesional");
        menjadiIOSDeveloperExpert.setTime(70);
        menjadiIOSDeveloperExpert.setTechnology("iOS");

        // Front-End Web Developer
        frontEndWebDeveloper.setName("Front-End Web Developer");
        frontEndWebDeveloper.setDescription("Kurikulum disusun oleh dicoding.Dicoding dan pelaku industri di bidang Web Development. Siswa dipersiapkan untuk menjadi Front-End Web Developer sesuai standar kebutuhan industri.");
        frontEndWebDeveloper.setClassAcademy(3);

        belajarDasarPemrogramanWeb.setStep(1);
        belajarDasarPemrogramanWeb.setName("Belajar Dasar Pemrograman Web");
        belajarDasarPemrogramanWeb.setDescription("Pelajari komponen-komponen dasar HTML, CSS, dan JavaScript yang merupakan fondasi utama untuk menjadi web developer.");
        belajarDasarPemrogramanWeb.setLevel("Dasar - Pemula");
        belajarDasarPemrogramanWeb.setTime(55);
        belajarDasarPemrogramanWeb.setTechnology("Web");

        belajarFundamentalFrontEndWebDevelopment.setStep(2);
        belajarFundamentalFrontEndWebDevelopment.setName("Belajar Fundamental Front-End Web Development");
        belajarFundamentalFrontEndWebDevelopment.setDescription("Pelajari sintaks ES6, Web Component, dan Build Tools dalam membangun website dengan teknik yang simple, reusable, dan optimized.");
        belajarFundamentalFrontEndWebDevelopment.setLevel("Pemula - Menengah");
        belajarFundamentalFrontEndWebDevelopment.setTime(70);
        belajarFundamentalFrontEndWebDevelopment.setTechnology("Web");

        menjadiFrontEndWebDeveloperExpert.setStep(3);
        menjadiFrontEndWebDeveloperExpert.setName("Menjadi Front-End Web Developer Expert");
        menjadiFrontEndWebDeveloperExpert.setDescription("Pelajari teknik-teknik expert serta modern dalam membangun website yang optimal pada seluruh perangkat, terutama pada perangkat mobile.");
        menjadiFrontEndWebDeveloperExpert.setLevel("Mahir - Profesional");
        menjadiFrontEndWebDeveloperExpert.setTime(90);
        menjadiFrontEndWebDeveloperExpert.setTechnology("Web");

        // Back-End Developer
        backEndDeveloper.setName("Back-End Developer");
        backEndDeveloper.setDescription("Kurikulum disusun oleh dicoding.Dicoding bersama AWS beserta pelaku industri Back-End Development. Siswa dipersiapkan untuk menjadi Back-End Developer sesuai kebutuhan industri.");
        backEndDeveloper.setClassAcademy(6);

        belajarDasarAWSCloud.setStep(1);
        belajarDasarAWSCloud.setName("Cloud Practitioner Essentials (Belajar Dasar AWS Cloud)");
        belajarDasarAWSCloud.setDescription("Pelajari materi dasar Cloud dengan menggunakan AWS, dari konsep cloud computing, hingga cara membangun arsitektur yang baik.");
        belajarDasarAWSCloud.setLevel("Dasar");
        belajarDasarAWSCloud.setTime(13);
        belajarDasarAWSCloud.setTechnology("Cloud Computing");

        belajarDasarPemrogramanJavaScript.setStep(2);
        belajarDasarPemrogramanJavaScript.setName("Belajar Dasar Pemrograman JavaScript");
        belajarDasarPemrogramanJavaScript.setDescription("Pelajari dasar JavaScript, dari fundamental, sintaks dan fitur ES6, hingga konsep automation test menggunakan framework populer.");
        belajarDasarPemrogramanJavaScript.setLevel("Dasar");
        belajarDasarPemrogramanJavaScript.setTime(45);
        belajarDasarPemrogramanJavaScript.setTechnology("Web");

        belajarMembuatAplikasiBackEndUntukPemula.setStep(3);
        belajarMembuatAplikasiBackEndUntukPemula.setName("Belajar Membuat Aplikasi Back-End untuk Pemula");
        belajarMembuatAplikasiBackEndUntukPemula.setDescription("Pelajari dasar dalam membangun RESTful API, dari HTTP server, routing, hingga membangun Back-End untuk aplikasi yang nyata.");
        belajarMembuatAplikasiBackEndUntukPemula.setLevel("Pemula");
        belajarMembuatAplikasiBackEndUntukPemula.setTime(45);
        belajarMembuatAplikasiBackEndUntukPemula.setTechnology("Cloud Computing, Web");

        membangunArsitekturAWSDiCloud.setStep(4);
        membangunArsitekturAWSDiCloud.setName("Architecting on AWS (Membangun Arsitektur AWS di Cloud)");
        membangunArsitekturAWSDiCloud.setDescription("Pelajari cara membangun arsitektur cloud di AWS, dari yang sederhana dengan Amazon S3, hingga yang canggih dengan serverless.");
        membangunArsitekturAWSDiCloud.setLevel("Pemula - Menengah");
        membangunArsitekturAWSDiCloud.setTime(40);
        membangunArsitekturAWSDiCloud.setTechnology("Cloud Computing");

        belajarFundamentalAplikasiBackEnd.setStep(5);
        belajarFundamentalAplikasiBackEnd.setName("Belajar Fundamental Aplikasi Back-End");
        belajarFundamentalAplikasiBackEnd.setDescription("Pelajari teknologi dalam membangun RESTful API yang canggih. Dari Database, Storage, hingga Authentication dan Authorization.");
        belajarFundamentalAplikasiBackEnd.setLevel("Menengah");
        belajarFundamentalAplikasiBackEnd.setTime(90);
        belajarFundamentalAplikasiBackEnd.setTechnology("Cloud Computing, Web");

        menjadiBackEndDeveloperExpert.setStep(6);
        menjadiBackEndDeveloperExpert.setName("Menjadi Back-End Developer Expert");
        menjadiBackEndDeveloperExpert.setDescription("Pelajari teknik pengoptimalan RESTful API. Seperti Clean Architecture, CI/CD, Serverless, hingga dokumentasi API dengan Swagger.");
        menjadiBackEndDeveloperExpert.setLevel("Mahir - Profesional");
        menjadiBackEndDeveloperExpert.setTime(90);
        menjadiBackEndDeveloperExpert.setTechnology("Cloud Computing, Web");

        // Azure Cloud Developer
        azureCloudDeveloper.setName("Azure Cloud Developer");
        azureCloudDeveloper.setDescription("Kurikulum lengkap yang didesain bersama salah satu penyedia cloud solution terbesar di dunia yaitu Microsoft Azure. Setiap kelas mempersiapkan siswa untuk ujian sertifikasi resmi Azure dari Microsoft.");
        androidDeveloper.setClassAcademy(2);

        belajarDasarDasarAzureCloud.setStep(1);
        belajarDasarDasarAzureCloud.setName("Belajar Dasar-Dasar Azure Cloud");
        belajarDasarDasarAzureCloud.setDescription("Pahami prinsip dan konsep dari komputasi awan disertai pengenalan layanan-layanan dari Microsoft Azure sesuai kebutuhan sertifikasi AZ-900.");
        belajarDasarDasarAzureCloud.setLevel("Dasar");
        belajarDasarDasarAzureCloud.setTime(40);
        belajarDasarDasarAzureCloud.setTechnology("Cloud Computing");

        menjadiAzureCloudDeveloper.setStep(2);
        menjadiAzureCloudDeveloper.setName("Menjadi Azure Cloud Developer");
        menjadiAzureCloudDeveloper.setDescription("Pelajari konsep dan terminologi cloud beserta berbagai layanan Azure Cloud sesuai kebutuhan sertifikasi Azure Developer Associate.");
        menjadiAzureCloudDeveloper.setLevel("Pemula - Menengah");
        menjadiAzureCloudDeveloper.setTime(40);
        menjadiAzureCloudDeveloper.setTechnology("Cloud Computing, Web");

        // Multi-Platform App Developer
        multiPlatformAppDeveloper.setName("Multi-Platform App Developer");
        multiPlatformAppDeveloper.setDescription("Kurikulum disusun oleh dicoding.Dicoding bersama Google beserta pelaku industri Multi-Platform App Development. Siswa dipersiapkan untuk menjadi Multi-Platform App Developer sesuai standar kebutuhan industri.");
        multiPlatformAppDeveloper.setClassAcademy(5);

        memulaiPemrogramanDenganDart.setStep(1);
        memulaiPemrogramanDenganDart.setName("Memulai Pemrograman Dengan Dart");
        memulaiPemrogramanDenganDart.setDescription("Kelas pengantar buat kamu yang ingin mempelajari bahasa populer dari Google untuk mengembangkan aplikasi multiplatform seperti Flutter.");
        memulaiPemrogramanDenganDart.setLevel("Dasar");
        memulaiPemrogramanDenganDart.setTime(20);
        memulaiPemrogramanDenganDart.setTechnology("Multi Platform");

        belajarMembuatAplikasiFlutterUntukPemula.setStep(3);
        belajarMembuatAplikasiFlutterUntukPemula.setName("Belajar Membuat Aplikasi Flutter untuk Pemula");
        belajarMembuatAplikasiFlutterUntukPemula.setDescription("Pelajari cara membuat aplikasi multi-platform pertamamu menggunakan Flutter. Kelas ini mengajarkan mulai dari fundamental hingga widget.");
        belajarMembuatAplikasiFlutterUntukPemula.setLevel("Pemula");
        belajarMembuatAplikasiFlutterUntukPemula.setTime(40);
        belajarMembuatAplikasiFlutterUntukPemula.setTechnology("Android, iOS, Multi Platform");

        belajarFundamentalAplikasiFlutter.setStep(4);
        belajarFundamentalAplikasiFlutter.setName("Belajar Fundamental Aplikasi Flutter");
        belajarFundamentalAplikasiFlutter.setDescription("Pelajari komponen fundamental Flutter berdasarkan teknik yang digunakan industri mulai dari state management, API, database, sampai testing.");
        belajarFundamentalAplikasiFlutter.setLevel("Menengah");
        belajarFundamentalAplikasiFlutter.setTime(60);
        belajarFundamentalAplikasiFlutter.setTechnology("Android, iOS, Multi Platform");

        menjadiFlutterDeveloperExpert.setStep(5);
        menjadiFlutterDeveloperExpert.setName("Menjadi Flutter Developer Expert");
        menjadiFlutterDeveloperExpert.setDescription("Tingkatkan skill kamu menjadi seorang Flutter expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri.");
        menjadiFlutterDeveloperExpert.setLevel("Mahir");
        menjadiFlutterDeveloperExpert.setTime(70);
        menjadiFlutterDeveloperExpert.setTechnology("Android, iOS, Multi Platform");

        machineLearningDeveloper.show(machineLearningDeveloper.getName(), machineLearningDeveloper.getDescription(), machineLearningDeveloper.getClassAcademy());
        belajarDasarVisualisasiData.show(belajarDasarVisualisasiData.getStep(), belajarDasarVisualisasiData.getName(), belajarDasarVisualisasiData.getDescription(), belajarDasarVisualisasiData.getLevel(), belajarDasarVisualisasiData.getTime(), belajarDasarVisualisasiData.getTechnology());
        memulaiPemrogramanDenganPython.show(memulaiPemrogramanDenganPython.getStep(), memulaiPemrogramanDenganPython.getName(), memulaiPemrogramanDenganPython.getDescription(), memulaiPemrogramanDenganPython.getLevel(), memulaiPemrogramanDenganPython.getTime(), memulaiPemrogramanDenganPython.getTechnology());
        belajarMachineLearningUntukPemula.show(belajarMachineLearningUntukPemula.getStep(), belajarMachineLearningUntukPemula.getName(), belajarMachineLearningUntukPemula.getDescription(), belajarMachineLearningUntukPemula.getLevel(), belajarMachineLearningUntukPemula.getTime(), belajarMachineLearningUntukPemula.getTechnology());
        belajarPengembanganMachineLearning.show(belajarPengembanganMachineLearning.getStep(), belajarPengembanganMachineLearning.getName(), belajarPengembanganMachineLearning.getDescription(), belajarPengembanganMachineLearning.getLevel(), belajarPengembanganMachineLearning.getTime(), belajarPengembanganMachineLearning.getTechnology());

        androidDeveloper.show(androidDeveloper.getName(), androidDeveloper.getDescription(), androidDeveloper.getClassAcademy());
        memulaiPemrogramanDenganKotlin.show(memulaiPemrogramanDenganKotlin.getStep(), memulaiPemrogramanDenganKotlin.getName(), memulaiPemrogramanDenganKotlin.getDescription(), memulaiPemrogramanDenganKotlin.getLevel(), memulaiPemrogramanDenganKotlin.getTime(), memulaiPemrogramanDenganKotlin.getTechnology());
        belajarPrinsipPemrogramanSOLID.show(belajarPrinsipPemrogramanSOLID.getStep(), belajarPrinsipPemrogramanSOLID.getName(), belajarPrinsipPemrogramanSOLID.getDescription(), belajarPrinsipPemrogramanSOLID.getLevel(), belajarPrinsipPemrogramanSOLID.getTime(), belajarPrinsipPemrogramanSOLID.getTechnology());
        belajarMembuatAplikasiAndroidUntukPemula.show(belajarMembuatAplikasiAndroidUntukPemula.getStep(), belajarMembuatAplikasiAndroidUntukPemula.getName(), belajarMembuatAplikasiAndroidUntukPemula.getDescription(), belajarMembuatAplikasiAndroidUntukPemula.getLevel(), belajarMembuatAplikasiAndroidUntukPemula.getTime(), belajarMembuatAplikasiAndroidUntukPemula.getTechnology());
        belajarFundamentalAplikasiAndroid.show(belajarFundamentalAplikasiAndroid.getStep(), belajarFundamentalAplikasiAndroid.getName(), belajarFundamentalAplikasiAndroid.getDescription(), belajarFundamentalAplikasiAndroid.getLevel(), belajarFundamentalAplikasiAndroid.getTime(), belajarFundamentalAplikasiAndroid.getTechnology());
        belajarAndroidJetpackPro.show(belajarAndroidJetpackPro.getStep(), belajarAndroidJetpackPro.getName(), belajarAndroidJetpackPro.getDescription(), belajarAndroidJetpackPro.getLevel(), belajarAndroidJetpackPro.getTime(), belajarAndroidJetpackPro.getTechnology());
        menjadiAndroidDeveloperExpert.show(menjadiAndroidDeveloperExpert.getStep(), menjadiAndroidDeveloperExpert.getName(), menjadiAndroidDeveloperExpert.getDescription(), menjadiAndroidDeveloperExpert.getLevel(), menjadiAndroidDeveloperExpert.getTime(), menjadiAndroidDeveloperExpert.getTechnology());

        iOSDeveloper.show(iOSDeveloper.getName(), iOSDeveloper.getDescription(), iOSDeveloper.getClassAcademy());
        memulaiPemrogramanDenganSwift.show(memulaiPemrogramanDenganSwift.getStep(), memulaiPemrogramanDenganSwift.getName(), memulaiPemrogramanDenganSwift.getDescription(), memulaiPemrogramanDenganSwift.getLevel(), memulaiPemrogramanDenganSwift.getTime(), memulaiPemrogramanDenganSwift.getTechnology());
        belajarMembuatAplikasiIOSUntukPemula.show(belajarMembuatAplikasiIOSUntukPemula.getStep(), belajarMembuatAplikasiIOSUntukPemula.getName(), belajarMembuatAplikasiIOSUntukPemula.getDescription(), belajarMembuatAplikasiIOSUntukPemula.getLevel(), belajarMembuatAplikasiIOSUntukPemula.getTime(), belajarMembuatAplikasiIOSUntukPemula.getTechnology());
        belajarFundamentalAplikasiIOS.show(belajarFundamentalAplikasiIOS.getStep(), belajarFundamentalAplikasiIOS.getName(), belajarFundamentalAplikasiIOS.getDescription(), belajarFundamentalAplikasiIOS.getLevel(), belajarFundamentalAplikasiIOS.getTime(), belajarFundamentalAplikasiIOS.getTechnology());
        menjadiIOSDeveloperExpert.show(menjadiIOSDeveloperExpert.getStep(), menjadiIOSDeveloperExpert.getName(), menjadiIOSDeveloperExpert.getDescription(), menjadiIOSDeveloperExpert.getLevel(), menjadiIOSDeveloperExpert.getTime(), menjadiIOSDeveloperExpert.getTechnology());

        frontEndWebDeveloper.show(frontEndWebDeveloper.getName(), frontEndWebDeveloper.getDescription(), frontEndWebDeveloper.getClassAcademy());
        belajarDasarPemrogramanWeb.show(belajarDasarPemrogramanWeb.getStep(), belajarDasarPemrogramanWeb.getName(), belajarDasarPemrogramanWeb.getDescription(), belajarDasarPemrogramanWeb.getLevel(), belajarDasarPemrogramanWeb.getTime(), belajarDasarPemrogramanWeb.getTechnology());
        belajarFundamentalFrontEndWebDevelopment.show(belajarFundamentalFrontEndWebDevelopment.getStep(), belajarFundamentalFrontEndWebDevelopment.getName(), belajarFundamentalFrontEndWebDevelopment.getDescription(), belajarFundamentalFrontEndWebDevelopment.getLevel(), belajarFundamentalFrontEndWebDevelopment.getTime(), belajarFundamentalFrontEndWebDevelopment.getTechnology());
        menjadiFrontEndWebDeveloperExpert.show(menjadiFrontEndWebDeveloperExpert.getStep(), menjadiFrontEndWebDeveloperExpert.getName(), menjadiFrontEndWebDeveloperExpert.getDescription(), menjadiFrontEndWebDeveloperExpert.getLevel(), menjadiFrontEndWebDeveloperExpert.getTime(), menjadiFrontEndWebDeveloperExpert.getTechnology());

        backEndDeveloper.show(backEndDeveloper.getName(), backEndDeveloper.getDescription(), backEndDeveloper.getClassAcademy());
        belajarDasarAWSCloud.show(belajarDasarAWSCloud.getStep(), belajarDasarAWSCloud.getName(), belajarDasarAWSCloud.getDescription(), belajarDasarAWSCloud.getLevel(), belajarDasarAWSCloud.getTime(), belajarDasarAWSCloud.getTechnology());
        belajarDasarPemrogramanJavaScript.show(belajarDasarPemrogramanJavaScript.getStep(), belajarDasarPemrogramanJavaScript.getName(), belajarDasarPemrogramanJavaScript.getDescription(), belajarDasarPemrogramanJavaScript.getLevel(), belajarDasarPemrogramanJavaScript.getTime(), belajarDasarPemrogramanJavaScript.getTechnology());
        belajarMembuatAplikasiBackEndUntukPemula.show(belajarMembuatAplikasiBackEndUntukPemula.getStep(), belajarMembuatAplikasiBackEndUntukPemula.getName(), belajarMembuatAplikasiBackEndUntukPemula.getDescription(), belajarMembuatAplikasiBackEndUntukPemula.getLevel(), belajarMembuatAplikasiBackEndUntukPemula.getTime(), belajarMembuatAplikasiBackEndUntukPemula.getTechnology());
        membangunArsitekturAWSDiCloud.show(membangunArsitekturAWSDiCloud.getStep(), membangunArsitekturAWSDiCloud.getName(), membangunArsitekturAWSDiCloud.getDescription(), membangunArsitekturAWSDiCloud.getLevel(), membangunArsitekturAWSDiCloud.getTime(), membangunArsitekturAWSDiCloud.getTechnology());
        belajarFundamentalAplikasiBackEnd.show(belajarFundamentalAplikasiBackEnd.getStep(), belajarFundamentalAplikasiBackEnd.getName(), belajarFundamentalAplikasiBackEnd.getDescription(), belajarFundamentalAplikasiBackEnd.getLevel(), belajarFundamentalAplikasiBackEnd.getTime(), belajarFundamentalAplikasiBackEnd.getTechnology());
        menjadiBackEndDeveloperExpert.show(menjadiBackEndDeveloperExpert.getStep(), menjadiBackEndDeveloperExpert.getName(), menjadiBackEndDeveloperExpert.getDescription(), menjadiBackEndDeveloperExpert.getLevel(), menjadiBackEndDeveloperExpert.getTime(), menjadiBackEndDeveloperExpert.getTechnology());

        azureCloudDeveloper.show(azureCloudDeveloper.getName(), azureCloudDeveloper.getDescription(), azureCloudDeveloper.getClassAcademy());
        belajarDasarDasarAzureCloud.show(belajarDasarDasarAzureCloud.getStep(), belajarDasarDasarAzureCloud.getName(), belajarDasarDasarAzureCloud.getDescription(), belajarDasarDasarAzureCloud.getLevel(), belajarDasarDasarAzureCloud.getTime(), belajarDasarDasarAzureCloud.getTechnology());
        menjadiAzureCloudDeveloper.show(menjadiAzureCloudDeveloper.getStep(), menjadiAzureCloudDeveloper.getName(), menjadiAzureCloudDeveloper.getDescription(), menjadiAzureCloudDeveloper.getLevel(), menjadiAzureCloudDeveloper.getTime(), menjadiAzureCloudDeveloper.getTechnology());

        multiPlatformAppDeveloper.show(multiPlatformAppDeveloper.getName(), multiPlatformAppDeveloper.getDescription(), multiPlatformAppDeveloper.getClassAcademy());
        memulaiPemrogramanDenganDart.show(memulaiPemrogramanDenganDart.getStep(), memulaiPemrogramanDenganDart.getName(), memulaiPemrogramanDenganDart.getDescription(), memulaiPemrogramanDenganDart.getLevel(), memulaiPemrogramanDenganDart.getTime(), memulaiPemrogramanDenganDart.getTechnology());
        belajarMembuatAplikasiFlutterUntukPemula.show(belajarMembuatAplikasiFlutterUntukPemula.getStep(), belajarMembuatAplikasiFlutterUntukPemula.getName(), belajarMembuatAplikasiFlutterUntukPemula.getDescription(), belajarMembuatAplikasiFlutterUntukPemula.getLevel(), belajarMembuatAplikasiFlutterUntukPemula.getTime(), belajarMembuatAplikasiFlutterUntukPemula.getTechnology());
        belajarFundamentalAplikasiFlutter.show(belajarFundamentalAplikasiFlutter.getStep(), belajarFundamentalAplikasiFlutter.getName(), belajarFundamentalAplikasiFlutter.getDescription(), belajarFundamentalAplikasiFlutter.getLevel(), belajarFundamentalAplikasiFlutter.getTime(), belajarFundamentalAplikasiFlutter.getTechnology());
        menjadiFlutterDeveloperExpert.show(menjadiFlutterDeveloperExpert.getStep(), menjadiFlutterDeveloperExpert.getName(), menjadiFlutterDeveloperExpert.getDescription(), menjadiFlutterDeveloperExpert.getLevel(), menjadiFlutterDeveloperExpert.getTime(), menjadiFlutterDeveloperExpert.getTechnology());
    }
}
