# KLU Social Internship Android App

An Android application developed for a social internship project (likely part of Koneru Lakshmaiah University - KLU curriculum). The app facilitates collecting, storing, and managing survey data for households and villages.

## 🚀 Features

- **Household Survey Form**: Comprehensive form to collect information including:
  - Basic Profile (Village, Gram Panchayat, Ward No, etc.)
  - Residential Profile
  - General Information
  - Migration Information
  - Government Schemes Information
  - Land and Livestock Details
- **Village Survey Form**: Dedicated section for village-level data collection.
- **Saved Reports**: Offline access and management of completed survey reports using local storage.
- **Data Persistence**: Offline-first approach using `SharedPreferences` (via `LocalStorage`) and potential cloud integration with Firebase.
- **User Interface**: Clean and intuitive UI built with Material Design components, CardViews, and Expandable layouts.

## 🛠️ Tech Stack

- **Platform**: Android
- **Language**: Java 8
- **UI Framework**: XML (Material Components, ConstraintLayout)
- **Database/Storage**:
  - **Local**: `SharedPreferences` with GSON for object serialization.
  - **Remote**: Firebase Firestore & Analytics (Integrated).
  - **Networking**: MySQL Connector Java (Legacy/Internal database support).
- **Architecture**: MVC (Model-View-Controller) pattern with dedicated Entity classes.

## 📂 Project Structure

- `app/src/main/java/com/praneeth/works/projects/socialinternship/`
  - `Account/`: User authentication related activities (Login).
  - `Forms/`: Survey forms and logic.
    - `Entity/`: Data models (POJOs) for surveys like `HouseServeyEntity`.
  - `Information/`: Utility classes for data management like `LocalStorage`.
  - `ReportsActivity/`: Activities for displaying and managing saved reports.
  - `Test/`: Experimental or testing utilities.

## ⚙️ Configuration & Prerequisites

- **Minimum SDK**: 24 (Android 7.0 Nougat)
- **Target SDK**: 34 (Android 14)
- **Permissions**:
  - `INTERNET`: For cloud sync/Firebase.
  - `WRITE_EXTERNAL_STORAGE`: For saving files locally.
  - `ACCESS_WIFI_STATE`: Network diagnostics.

## 🔧 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/[your-username]/KLU_Social_Intership_AndroidApp.git
   ```
2. Open the project in **Android Studio**.
3. Sync the project with Gradle files.
4. (Optional) Set up your `google-services.json` in the `app/` directory if you wish to use Firebase features.
5. Run the app on an emulator or physical device.

## 📝 License

This project is intended for educational and internship purposes at KLU.

---
*Developed by Praneeth*
