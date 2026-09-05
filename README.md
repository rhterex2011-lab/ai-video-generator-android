# AI Video Generator - Android App

تطبيق أندرويد لتوليد الفيديوهات بالذكاء الاصطناعي | Open-source AI-powered video generation for Android

## المميزات | Features

- 🎬 تحويل النصوص إلى فيديوهات احترافية
- 🎤 إضافة الراوي الآلي (Text-to-Speech)
- 📝 ترجمات فورية
- 🎭 شخصية رقمية (Digital Anchor)
- 🖼️ دعم الصور والموسيقى
- 💾 إدارة الفيديوهات المُنشأة
- 🔄 معاينة فورية

## المتطلبات | Requirements

- Android 7.0 (API 24) أو أحدث
- Android Studio Giraffe أو أحدث
- Kotlin 1.9+
- JDK 8 أو أحدث

## التثبيت | Installation

```bash
git clone https://github.com/rhterex2011-lab/ai-video-generator-android.git
cd ai-video-generator-android
```

## البنية المشروع | Project Structure

```
app/
├── src/main/
│   ├── kotlin/com/aivideogenerator/app/
│   │   ├── ui/
│   │   │   ├── screens/      # شاشات التطبيق
│   │   │   └── theme/        # التصميم والألوان
│   │   ├── data/             # طبقة البيانات
│   │   ├── domain/           # منطق العمل
│   │   └── network/          # الاتصالات
│   └── res/
│       ├── drawable/         # الصور والأيقونات
│       ├── values/           # الموارد
│       └── layout/           # تخطيطات XML
└── build.gradle.kts          # تكوين Gradle
```

## التكنولوجيات المستخدمة | Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Navigation**: Jetpack Navigation
- **Networking**: Retrofit + OkHttp
- **Dependency Injection**: Koin
- **Database**: Room
- **Image Loading**: Coil
- **Video Processing**: ExoPlayer/Media3
- **Async**: Coroutines

## البدء السريع | Quick Start

1. افتح المشروع في Android Studio
2. قم بمزامنة Gradle
3. قم بتشغيل التطبيق على جهاز محاكاة أو هاتف حقيقي

```bash
# من سطر الأوامر
./gradlew build
./gradlew installDebug
```

## المساهمة | Contributing

نرحب بالمساهمات! يرجى:

1. Fork المستودع
2. أنشئ فرع للمميزة (`git checkout -b feature/amazing-feature`)
3. قم بـ Commit التغييرات (`git commit -m 'Add amazing feature'`)
4. Push إلى الفرع (`git push origin feature/amazing-feature`)
5. افتح Pull Request

## الترخيص | License

هذا المشروع مرخص تحت رخصة MIT - انظر ملف [LICENSE](LICENSE) للتفاصيل.

## التواصل | Contact

- 📧 البريد الإلكتروني: your.email@example.com
- 🐦 تويتر: [@yourhandle](https://twitter.com/yourhandle)
- 💬 المناقشات: [GitHub Discussions](https://github.com/rhterex2011-lab/ai-video-generator-android/discussions)

## الشكر والتقدير | Acknowledgments

- شكر خاص لمشروع [agnes-video-generator](https://github.com/lcy362/agnes-video-generator)
- شكر للمجتمع الذي يساهم في تطوير المشروع

---

**صنع بـ ❤️ من قبل rhterex2011-lab**
