

# Installing Prerequisites for ios Training 

- Homebrew
- Nodejs
- npm
- Xcode
- Appium inspector gui


## 0. Open Terminal

Press command + spacebar and Search for "Terminal" Then, Hit Enter.
<img width="672" alt="Screenshot 2023-04-04 at 6 59 31 PM" src="https://user-images.githubusercontent.com/29010350/229799900-57dcc84a-6a90-4dd7-9102-802b13d3d5fc.png">

<img width="555" alt="Screenshot 2023-04-04 at 7 02 48 PM" src="https://user-images.githubusercontent.com/29010350/229800252-80f1eb99-c9c6-4167-9bdd-bfc4b161ea0c.png">



## 1. Homebrew Installation

  Open Browser. Go to [https://brew.sh](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)


 Copy the command under "Install Homebrew". The command will be like: 

```bash
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

 Now open Terminal (Shortcut method: press command+spacebar to open spotlight search and type terminal and hit return/Enter). 
Paste(command+v) the copied Command into terminal and hit enter.  
Give the user password in the terminal if its asks.

After successful installation, 
there will be a command like on the termainal, Just copy that command and paste onto the terminal. The Command will look like the below one but with different UserName. 

```
(echo; echo 'eval "$(/opt/homebrew/bin/brew shellenv)"') >> /Users/Shawon/.zprofile            
    eval "$(/opt/homebrew/bin/brew shellenv)"  
```

## 2. Carthage Installation

Hit the following Command on Terminal:
```
brew install carthage
```

## 3. Nodejs,npm Installation

To install both Nodejs & npm, hit the following command in the terminal: 
```bash
brew install node
```
After installation, to check if Nodejs is installed or not, hit following command:   
```bash
node --version
```
To check if npm is installed or not, hit following command   
```bash
npm -v
```

## 4. Xcode Installation

To install Xcode hit the following command on terminal:

``` 
brew install --cask xcode
```
After Installaion hit the following command to check if its properly installed.
```
xcode-select --version
```

### Install xcode command line tools: 

```
xcode-select --install 
```
Verify the installation by running the following command:
```
gcc --version
```

https://stackoverflow.com/questions/9329243/how-to-install-xcode-command-line-tools , 
https://www.freecodecamp.org/news/install-xcode-command-line-tools/


## 5. Install Appium Inspector GUI for macOS
### Install Appium by terminal:

Install appium:
```
npm install -g appium
```

Install appium-doctor:
```
npm install -g appium-doctor
```
### Or, you can install Appium manually:

   Go to the Appium Desktop GitHub page at https://github.com/appium/appium-desktop/releases 

- Under the "Latest release" section, click on the "Assets" drop-down to expand the list of available files.

- Look for the file with the name "Appium-mac-x.x.x.dmg" where "x.x.x" represents the version number. This is the file you need to download.

- Click on the "Download" button next to the file name to start the download.

 Once the download is complete, open the downloaded file and double-click on the Appium icon to launch the Appium Desktop Inspector GUI. Follow the on-screen instructions to complete the installation.

- While opening the Gui, This message pops up ' “Appium Inspector” can’t be opened because Apple cannot check it for malicious software.'

-  To mitigate this, just go to System preferences > Security & Privacy > General and say Open Anyway for Appium Inspector.


## 6. Connecting Simulator with Appium inspector:

Create an empty project with hello world in it. Then build it on a specific device to open
simulator.
- Hit command+spacebar to type "xcode" then Open xcode.
- Then Follow as the screenshots below: 

Select "Create a new Xcode project"
<img width="799" alt="Screenshot 2023-04-04 at 4 39 15 PM" src="https://user-images.githubusercontent.com/29010350/229845711-0dda8d7b-d0da-43e2-a532-f02d2d1dde17.png">

Click Next  
<img width="737" alt="Screenshot 2023-04-04 at 4 39 49 PM" src="https://user-images.githubusercontent.com/29010350/229846176-be5d993b-cdf7-4f99-a7b7-7b2bf2c9d713.png">

Click Next  
<img width="732" alt="Screenshot 2023-04-04 at 4 42 07 PM" src="https://user-images.githubusercontent.com/29010350/229846699-2f86fdb3-7678-4692-afe8-018d52c237bb.png">

Click Create  
<img width="798" alt="Screenshot 2023-04-04 at 9 48 28 PM" src="https://user-images.githubusercontent.com/29010350/229847192-bdbac2f7-0b84-4c45-8b88-277e70491486.png"> 

Click on the marked area  
<img width="732" alt="Screenshot 2023-04-04 at 9 51 21 PM" src="https://user-images.githubusercontent.com/29010350/229862204-3047a25f-7f85-4ee2-864b-fa7086ae92c8.png">
<img width="732" alt="Screenshot 2023-04-04 at 9 51 56 PM" src="https://user-images.githubusercontent.com/29010350/229854317-e1dd390a-5b64-4de1-9ded-11a35ab3c8ea.png">

Have a look at the emulators Name and Version, It will be needed while creating capabilities for Appium Server.   
<img width="732" alt="Screenshot 2023-04-04 at 9 52 09 PM" src="https://user-images.githubusercontent.com/29010350/229856234-58aa382d-d1a9-48e2-9758-ab19b0f0ddba.png">

### Download webdriverAgent from this link (The Source Code Zip File) :
https://github.com/appium/WebDriverAgent/releases/tag/v4.9.0
<img width="732" alt="Screenshot 2023-04-04 at 4 51 37 PM" src="https://user-images.githubusercontent.com/29010350/229863552-30ee0f59-fab4-4003-b632-46d2fd78f852.png">

Extract the zip file and double-click on WebDriverAgent.xcodeproj file    
<img width="732" alt="Screenshot 2023-04-04 at 4 52 20 PM" src="https://user-images.githubusercontent.com/29010350/229892286-c0a4f845-fb51-4c29-b4c4-064933edcdb7.png">   

Select WebDriverAgent from left menu as below screenshot:
<img width="732" alt="Screenshot 2023-04-04 at 4 53 37 PM" src="https://user-images.githubusercontent.com/29010350/229864858-7831c74a-87d2-4479-bd5a-9546738e50df.png">

Click on Integration App and select WebDriverAgentRunner as like below screenshot:    
<img width="732" alt="Screenshot 2023-04-04 at 4 53 41 PM" src="https://user-images.githubusercontent.com/29010350/229865240-5731eca8-5732-4967-9272-949b7265454a.png">
<img width="732" alt="Screenshot 2023-04-04 at 4 53 48 PM" src="https://user-images.githubusercontent.com/29010350/229865698-33bb9e53-e54f-4492-a446-b6c31bee7738.png">

Select Product>>Test  
<img width="732" alt="Screenshot 2023-04-04 at 4 54 14 PM" src="https://user-images.githubusercontent.com/29010350/229868938-02d41653-c3c2-4dd3-878c-6cc773b047de.png">

After that WebDriverAgentRunner will be successfully installed on simulator 
<img width="732" alt="Screenshot 2023-04-04 at 4 55 12 PM" src="https://user-images.githubusercontent.com/29010350/229869226-593a523b-a355-43d0-be51-5afc35759270.png">

### Go to Terminal and hit Command: 
```
appium --allow-cors
```
<img width="577" alt="Screenshot 2023-04-04 at 4 56 24 PM" src="https://user-images.githubusercontent.com/29010350/229869644-63ae6b7d-1939-4e46-bef7-761103521827.png">

Open Appium inspector and Do as below Screenshot: 
<img width="732" alt="Screenshot 2023-04-05 at 12 24 06 AM" src="https://user-images.githubusercontent.com/29010350/229884831-05068232-6871-4f1c-8511-17088521bc10.png">

Save the capability and name it anything (for example: test). Click on the Saved Capability and click on Start session. After That Simuators Screen should be displayed on the Appium Inspector.    
<img width="732" alt="Screenshot 2023-04-04 at 5 11 07 PM" src="https://user-images.githubusercontent.com/29010350/229886081-87232a9c-dea1-4589-a612-638ca111d634.png">
  
    





## Appendix

#### Here is a brief overview of these tools/software that describes why we need these to be installed:
  #### Homebrew: 
  Homebrew is a package manager for macOS that allows you to easily install and manage various software packages and utilities on your system. It is commonly used by developers and other users to install and manage command-line tools, libraries, and other dependencies that are required for various software development projects.

#### Node.js: 
Node.js is an open-source, cross-platform JavaScript runtime environment that allows you to run JavaScript on the server-side. It is commonly used to build scalable, networked applications, and is particularly popular for building web applications and RESTful APIs.

#### npm: 
npm is the default package manager for Node.js and is used to install, manage, and share packages of code written in JavaScript. It is the largest ecosystem of open-source libraries in the world, with millions of packages available for use in Node.js projects.

#### Appium GUI Inspector: 
Appium GUI Inspector is a graphical user interface tool used to inspect the user interface (UI) elements of mobile applications. It allows developers and testers to easily view and interact with the UI elements of their mobile applications, and to create and execute Appium test scripts.

#### Xcode: 
Xcode is an integrated development environment (IDE) for macOS that is used to develop software for Apple's platforms, including macOS, iOS, watchOS, and tvOS. It includes a suite of tools for developing, debugging, and testing software, including a code editor, a graphical user interface designer, a build system, and various debugging and profiling tools. It is particularly important for developing native iOS applications, as it includes the iOS SDK and allows you to build and test your apps on a simulator or physical device.

