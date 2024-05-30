<template>
  <li
    class="list-group-item"
    :class="{ 'list-group-item-success': props.todoItem.completed }"
    @click="emit('toggle-completed', props.todoItem.id)"
  >
    <span class="pointer" :class="{ 'todo-done': props.todoItem.completed }">
      {{ props.todoItem.todo }}
      {{ props.todoItem.completed ? '완료' : '' }}</span
    >
    <span
      class="float-end badge bg-secondary pointer"
      @click.stop="emit('delete-todo', props.todoItem.id)"
      >삭제</span
    >
  </li>
</template>

<script setup>
const props = defineProps({
  todoItem: { type: Object, required: true },
});

const emit = defineEmits(['delete-todo', 'toggle-completed']);
</script>
