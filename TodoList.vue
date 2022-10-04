<template>
    <div>
        <ul>
            <TodoItem
                v-for="todo of todos"
                v-bind:todo="todo"
                v-bind:index="i"
                v-on:todo-remove="removeTodo"
            />
        </ul>
    </div>
</template>

<script>
    import TodoItem from '@/components/TodoItem'
    export default {
        props: ['todos'],
        components: {
            TodoItem
        },
        methods: {
            removeTodo(id) {
                // console.log(id)
                this.$emit('remove-todo', id)
            }
        }
    }
</script>