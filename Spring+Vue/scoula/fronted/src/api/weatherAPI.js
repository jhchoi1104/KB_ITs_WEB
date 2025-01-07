import api from 'axios';

const BASE_URL = '/api/weather';

export default {
  async getWeather() {
    const response = await api.get(BASE_URL);
    return response.data;
  },
};
