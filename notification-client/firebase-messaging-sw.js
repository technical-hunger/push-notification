importScripts('https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js');
importScripts('https://www.gstatic.com/firebasejs/8.10.0/firebase-messaging.js');

// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyAmZCfp4_YecBnUXQzekcoVXdQRvg_o4oo",
    authDomain: "push-notification-f9cc2.firebaseapp.com",
    projectId: "push-notification-f9cc2",
    storageBucket: "push-notification-f9cc2.appspot.com",
    messagingSenderId: "1026694408786",
    appId: "1:1026694408786:web:0c07b2c82bd7abd45d0d8b",
    measurementId: "G-6JGV708FL2"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const messaging = firebase.messaging();