# Ein Projekt mit Gradle erstellen

Um ein neues Projekt mit Gradle zu erstellen, folge diesen Schritten:

1. **Ist Gradle installiert?**:
    gradle -v

2. **Neues Projekt erstellen**:
    Erstellen Sie ein neues Verzeichnis für Ihr Projekt und navigieren Sie in dieses Verzeichnis:
    ```sh
    mkdir mein-projekt
    cd mein-projekt
    ```

3. **Gradle-Projekt initialisieren**:
    Verwenden Sie den folgenden Befehl, um ein neues Gradle-Projekt zu initialisieren:
    ```sh
    gradle init
    ```

4. **Projektstruktur**:
    Nach der Initialisierung sollte Ihre Projektstruktur wie folgt aussehen:
    ```
    mein-projekt/
    ├── build.gradle
    ├── settings.gradle
    └── src/
         ├── main/
         │   └── java/
         └── test/
              └── java/
    ```

5. **Build-Skript anpassen**:
    Bearbeiten Sie die `build.gradle` Datei, um Abhängigkeiten und andere Build-Konfigurationen hinzuzufügen.

6. **Projekt bauen**:
    Um Ihr Projekt zu bauen, verwenden Sie den folgenden Befehl:
    ```sh
    gradle build
    ```

7. **Projekt testen**:
    Um Ihr Projekt testen, können Sie den folgenden Befehl verwenden:
    ```sh
    gradle test
    ```

8. **Projekt ausführen**:
    Um Ihr Projekt auszuführen, können Sie den folgenden Befehl verwenden:
    ```sh
    gradle run
    ```

BOILERPLATE: SIEHE ./boilerplate