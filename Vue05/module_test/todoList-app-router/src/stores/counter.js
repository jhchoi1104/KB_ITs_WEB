import { ref, computed, reactive } from 'vue';
import { defineStore } from 'pinia';
import axios from 'axios';

export const useCounterStore = defineStore('counter', () => {
  const count = ref(0);
  const doubleCount = computed(() => count.value * 2);
  function increment() {
    count.value++;
  }

  const state = reactive({
    list: [{}, {}, {}],
  });

  const fetchTodoList = async () => {
    try {
      const response = await axios.get('/api/todos');
      state.list = response.data;
    } catch (error) {
      alert('에러 발생: ', error);
    }
  };

  const addTodo = async ({ todo, desc }) => {
    try {
      const response = await axios.post('/api/todos', { todo, desc });
    } catch (error) {
      alert('에러 발생: ', error);
    }
  };

  const updateTodo = async ({ id, todo, desc, done }) => {
    try {
      const response = await axios.put(`/api/todos/${id}`, {
        id,
        todo,
        desc,
        done,
      });
      let index = state.list.findIndex((item) => item.id == id);
      state.list[index] = { id, todo, desc, done };
    } catch (error) {
      alert(error);
    }
  };

  return { count, doubleCount, increment };
});
