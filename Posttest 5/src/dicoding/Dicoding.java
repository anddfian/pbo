package dicoding;

public final class Dicoding {

    public static void main(String[] args) {
        final String name = "Dicoding";

        // Machine Learning Developer
        LearningPath machineLearningDeveloper = new LearningPath(
                "Machine Learning Developer",
                "Kurikulum lengkap yang disusun oleh Dicoding bersama IBM dan Google beserta pelaku industri. Siswa dipersiapkan untuk menjadi Machine Learning Developer sesuai standar kebutuhan industri.",
                4
        );

        Academy belajarDasarVisualisasiData = new Academy(
                1,
                "Belajar Dasar Visualisasi Data",
                "Pelajari teknik dasar untuk representasi hasil secara visual sehingga dapat menceritakan dan mempresentasikan data secara efektif.",
                "Dasar",
                16,
                "Data, Machine Learning"
        );

        Academy memulaiPemrogramanDenganPython = new Academy(
                2,
                "Memulai Pemrograman Dengan Python",
                "Belajar Python yang menjadi landasan penting berbagai tren industri seperti ilmu data, pemelajaran mesin, dan manajemen infrastruktur.",
                "Dasar",
                20,
                "Data, Machine Learning"
        );

        Academy belajarMachineLearningUntukPemula = new Academy(
                3,
                "Belajar Machine Learning untuk Pemula",
                "Pelajari materi dasar pengembangan machine learning dan langkah menciptakan model machine learning pertamamu untuk memproses data.",
                "Pemula",
                30,
                "Machine Learning"
        );

        Academy belajarPengembanganMachineLearning = new Academy(
                4,
                "Belajar Pengembangan Machine Learning",
                "Pelajari implementasi machine learning pada industri mulai dari computer vision, natural language, serta deployment proyek machine learning.",
                "Menengah",
                40,
                "Machine Learning"
        );

        // Android Developer
        LearningPath androidDeveloper = new LearningPath(
                "Android Developer",
                "Kurikulum didesain oleh Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia. Siswa dipersiapkan untuk menjadi Android Developer berstandar global Google.",
                6
        );

        Academy memulaiPemrogramanDenganKotlin = new Academy(
                1,
                "Memulai Pemrograman Dengan Kotlin",
                "Kelas pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming (OOP) menggunakan Kotlin.",
                "Dasar - Pemula",
                50,
                "Android, Multi Platform"
        );

        Academy belajarPrinsipPemrogramanSOLID = new Academy(
                2,
                "Belajar Prinsip Pemrograman SOLID",
                "Pelajari kelima prinsip desain yang merupakan pedoman untuk rancangan kode yang baik pada pemrograman berorientasi objek (OOP).",
                "Dasar",
                15,
                "Android, iOS, Multi Platform, Web"
        );

        Academy belajarMembuatAplikasiAndroidUntukPemula = new Academy(
                3,
                "Belajar Membuat Aplikasi Android untuk Pemula",
                "Pelajari cara membuat aplikasi pertamamu dengan Android Studio. Kelas ini mengajarkan dasar Android mulai dari Intent sampai RecyclerView.",
                "Pemula",
                40,
                "Android"
        );

        Academy belajarFundamentalAplikasiAndroid = new Academy(
                4,
                "Belajar Fundamental Aplikasi Android",
                "Pelajari skill Android dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan. Mulai dari design pattern, testing, API sampai database.",
                "Menengah",
                150,
                "Android"
        );

        Academy belajarAndroidJetpackPro = new Academy(
                5,
                "Belajar Android Jetpack Pro",
                "Pelajari Android Jetpack dengan berbagai fitur canggih dan sudah diimplementasikan 80% dari 1000 aplikasi terbaik di Google Play Store.",
                "Mahir",
                70,
                "Android"
        );

        Academy menjadiAndroidDeveloperExpert = new Academy(
                6,
                "Menjadi Android Developer Expert",
                "Saatnya menjadi Android Expert dengan belajar Clean Architecture, Reactive, Dependency Injection, Modularization, Performance, dan Security.",
                "Profesional",
                90,
                "Android"
        );

        // iOS Developer
        LearningPath iOSDeveloper = new LearningPath(
                "iOS Developer",
                "Kurikulum disusun oleh Dicoding dan pelaku industri di bidang iOS Development. Siswa dipersiapkan untuk menjadi iOS Developer sesuai standar kebutuhan industri.",
                5
        );

        Academy memulaiPemrogramanDenganSwift = new Academy(
                1,
                "Memulai Pemrograman Dengan Swift",
                "Belajar bahasa Swift buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) dalam mengembangkan iOS dan OS X.",
                "Dasar",
                40,
                "iOS"
        );

        Academy belajarMembuatAplikasiIOSUntukPemula = new Academy(
                3,
                "Belajar Membuat Aplikasi iOS untuk Pemula",
                "Pelajari cara membuat aplikasi pertamamu dengan Xcode. Kelas ini mengajarkan dasar iOS mulai dari Controller sampai TableViews.",
                "Pemula",
                40,
                "iOS"
        );

        Academy belajarFundamentalAplikasiIOS = new Academy(
                4,
                "Belajar Fundamental Aplikasi iOS",
                "Pelajari komponen fundamental iOS berdasarkan teknik yang digunakan industri mulai dari App Design, SwiftUI, Networking, sampai Database.",
                "Menengah",
                70,
                "iOS"
        );

        Academy menjadiIOSDeveloperExpert = new Academy(
                5,
                "Menjadi iOS Developer Expert",
                "Saatnya jadi iOS Expert dengan belajar Clean Architecture, Reactive, Dependency Injection, Modularization, dan Test Driven Development.",
                "Mahir - Profesional",
                70,
                "iOS"
        );

        // Front-End Web Developer
        LearningPath frontEndWebDeveloper = new LearningPath(
                "Front-End Web Developer",
                "Kurikulum disusun oleh Dicoding dan pelaku industri di bidang Web Development. Siswa dipersiapkan untuk menjadi Front-End Web Developer sesuai standar kebutuhan industri.",
                3
        );

        Academy belajarDasarPemrogramanWeb = new Academy(
                1,
                "Belajar Dasar Pemrograman Web",
                "Pelajari komponen-komponen dasar HTML, CSS, dan JavaScript yang merupakan fondasi utama untuk menjadi web developer.",
                "Dasar - Pemula",
                55,
                "Web"
        );

        Academy belajarFundamentalFrontEndWebDevelopment = new Academy(
                2,
                "Belajar Fundamental Front-End Web Development",
                "Pelajari sintaks ES6, Web Component, dan Build Tools dalam membangun website dengan teknik yang simple, reusable, dan optimized.",
                "Pemula - Menengah",
                70,
                "Web"
        );

        Academy menjadiFrontEndWebDeveloperExpert = new Academy(
                3,
                "Menjadi Front-End Web Developer Expert",
                "Pelajari teknik-teknik expert serta modern dalam membangun website yang optimal pada seluruh perangkat, terutama pada perangkat mobile.",
                "Mahir - Profesional",
                90,
                "Web"
        );

        // Back-End Developer
        LearningPath backEndDeveloper = new LearningPath(
                "Back-End Developer",
                "Kurikulum disusun oleh Dicoding bersama AWS beserta pelaku industri Back-End Development. Siswa dipersiapkan untuk menjadi Back-End Developer sesuai kebutuhan industri.",
                6
        );

        Academy belajarDasarAWSCloud = new Academy(
                1,
                "Cloud Practitioner Essentials (Belajar Dasar AWS Cloud)",
                "Pelajari materi dasar Cloud dengan menggunakan AWS, dari konsep cloud computing, hingga cara membangun arsitektur yang baik.",
                "Dasar",
                13,
                "Cloud Computing"
        );

        Academy belajarDasarPemrogramanJavaScript = new Academy(
                2,
                "Belajar Dasar Pemrograman JavaScript",
                "Pelajari dasar JavaScript, dari fundamental, sintaks dan fitur ES6, hingga konsep automation test menggunakan framework populer.",
                "Dasar",
                45,
                "Web"
        );

        Academy belajarMembuatAplikasiBackEndUntukPemula = new Academy(
                3,
                "Belajar Membuat Aplikasi Back-End untuk Pemula",
                "Pelajari dasar dalam membangun RESTful API, dari HTTP server, routing, hingga membangun Back-End untuk aplikasi yang nyata.",
                "Pemula",
                45,
                "Cloud Computing, Web"
        );

        Academy membangunArsitekturAWSDiCloud = new Academy(
                4,
                "Architecting on AWS (Membangun Arsitektur AWS di Cloud)",
                "Pelajari cara membangun arsitektur cloud di AWS, dari yang sederhana dengan Amazon S3, hingga yang canggih dengan serverless.",
                "Pemula - Menengah",
                40,
                "Cloud Computing"
        );

        Academy belajarFundamentalAplikasiBackEnd = new Academy(
                5,
                "Belajar Fundamental Aplikasi Back-End",
                "Pelajari teknologi dalam membangun RESTful API yang canggih. Dari Database, Storage, hingga Authentication dan Authorization.",
                "Menengah",
                90,
                "Cloud Computing, Web"
        );

        Academy menjadiBackEndDeveloperExpert = new Academy(
                6,
                "Menjadi Back-End Developer Expert",
                "Pelajari teknik pengoptimalan RESTful API. Seperti Clean Architecture, CI/CD, Serverless, hingga dokumentasi API dengan Swagger.",
                "Mahir - Profesional",
                90,
                "Cloud Computing, Web"
        );

        // Azure Cloud Developer
        LearningPath azureCloudDeveloper = new LearningPath(
                "Azure Cloud Developer",
                "Kurikulum lengkap yang didesain bersama salah satu penyedia cloud solution terbesar di dunia yaitu Microsoft Azure. Setiap kelas mempersiapkan siswa untuk ujian sertifikasi resmi Azure dari Microsoft.",
                2
        );

        Academy belajarDasarDasarAzureCloud = new Academy(
                1,
                "Belajar Dasar-Dasar Azure Cloud",
                "Pahami prinsip dan konsep dari komputasi awan disertai pengenalan layanan-layanan dari Microsoft Azure sesuai kebutuhan sertifikasi AZ-900.",
                "Dasar",
                40,
                "Cloud Computing"
        );

        Academy menjadiAzureCloudDeveloper = new Academy(
                2,
                "Menjadi Azure Cloud Developer",
                "Pelajari konsep dan terminologi cloud beserta berbagai layanan Azure Cloud sesuai kebutuhan sertifikasi Azure Developer Associate.",
                "Pemula - Menengah",
                40,
                "Cloud Computing, Web"
        );

        // Multi-Platform App Developer
        LearningPath multiPlatformAppDeveloper = new LearningPath(
                "Multi-Platform App Developer",
                "Kurikulum disusun oleh Dicoding bersama Google beserta pelaku industri Multi-Platform App Development. Siswa dipersiapkan untuk menjadi Multi-Platform App Developer sesuai standar kebutuhan industri.",
                5
        );

        Academy memulaiPemrogramanDenganDart = new Academy(
                1,
                "Memulai Pemrograman Dengan Dart",
                "Kelas pengantar buat kamu yang ingin mempelajari bahasa populer dari Google untuk mengembangkan aplikasi multiplatform seperti Flutter.",
                "Dasar",
                20,
                "Multi Platform"
        );

        Academy belajarMembuatAplikasiFlutterUntukPemula = new Academy(
                3,
                "Belajar Membuat Aplikasi Flutter untuk Pemula",
                "Pelajari cara membuat aplikasi multi-platform pertamamu menggunakan Flutter. Kelas ini mengajarkan mulai dari fundamental hingga widget.",
                "Pemula",
                40,
                "Android, iOS, Multi Platform"
        );

        Academy belajarFundamentalAplikasiFlutter = new Academy(
                4,
                "Belajar Fundamental Aplikasi Flutter",
                "Pelajari komponen fundamental Flutter berdasarkan teknik yang digunakan industri mulai dari state management, API, database, sampai testing.",
                "Menengah",
                60,
                "Android, iOS, Multi Platform"
        );

        Academy menjadiFlutterDeveloperExpert = new Academy(
                5,
                "Menjadi Flutter Developer Expert",
                "Tingkatkan skill kamu menjadi seorang Flutter expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri.",
                "Mahir",
                70,
                "Android, iOS, Multi Platform"
        );

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
        belajarPrinsipPemrogramanSOLID.show(belajarPrinsipPemrogramanSOLID.getStep(), belajarPrinsipPemrogramanSOLID.getName(), belajarPrinsipPemrogramanSOLID.getDescription(), belajarPrinsipPemrogramanSOLID.getLevel(), belajarPrinsipPemrogramanSOLID.getTime(), belajarPrinsipPemrogramanSOLID.getTechnology());
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
        belajarPrinsipPemrogramanSOLID.show(belajarPrinsipPemrogramanSOLID.getStep(), belajarPrinsipPemrogramanSOLID.getName(), belajarPrinsipPemrogramanSOLID.getDescription(), belajarPrinsipPemrogramanSOLID.getLevel(), belajarPrinsipPemrogramanSOLID.getTime(), belajarPrinsipPemrogramanSOLID.getTechnology());
        belajarMembuatAplikasiFlutterUntukPemula.show(belajarMembuatAplikasiFlutterUntukPemula.getStep(), belajarMembuatAplikasiFlutterUntukPemula.getName(), belajarMembuatAplikasiFlutterUntukPemula.getDescription(), belajarMembuatAplikasiFlutterUntukPemula.getLevel(), belajarMembuatAplikasiFlutterUntukPemula.getTime(), belajarMembuatAplikasiFlutterUntukPemula.getTechnology());
        belajarFundamentalAplikasiFlutter.show(belajarFundamentalAplikasiFlutter.getStep(), belajarFundamentalAplikasiFlutter.getName(), belajarFundamentalAplikasiFlutter.getDescription(), belajarFundamentalAplikasiFlutter.getLevel(), belajarFundamentalAplikasiFlutter.getTime(), belajarFundamentalAplikasiFlutter.getTechnology());
        menjadiFlutterDeveloperExpert.show(menjadiFlutterDeveloperExpert.getStep(), menjadiFlutterDeveloperExpert.getName(), menjadiFlutterDeveloperExpert.getDescription(), menjadiFlutterDeveloperExpert.getLevel(), menjadiFlutterDeveloperExpert.getTime(), menjadiFlutterDeveloperExpert.getTechnology());

        System.out.println("Jumlah Alur Belajar " + name + ": " + LearningPath.getCountLearningPath());
        System.out.println("Jumlah Kelas Akademi " + name + ": " + Academy.getCountAcademy());
    }
}