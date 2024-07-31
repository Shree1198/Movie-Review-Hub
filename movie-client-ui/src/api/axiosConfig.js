import axios from 'axios';

export default axios.create({
    baseURL: 'http://localhost:8080', // Ensure the correct protocol and URL
    // baseURL: 'https://9c96-103-106-239-104.ap.ngrok.io', // Uncomment this when using ngrok
    headers: { "ngrok-skip-browser-warning": "true" } // This header is specific to ngrok
});
