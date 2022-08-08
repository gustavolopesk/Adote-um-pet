import axios from 'axios';

export const ApiService = axios.create({
    baseURL: 'http://localhost:8000/api',
    headers: {
        'Content-Type': 'appLication/json'
    }
})