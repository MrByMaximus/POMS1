<template>
    <form>
        <input type="text">
        <button type="submit">Create</button>
    </form>
</template>

<script>
    export default {
        data() {
            return {
                title: ''
            }
        },
        methods: {
            onSubmit() {
                console.log('Submit', this.title)
                if (this.title.trim()) {
                    const newTodo = {
                        id: Date.now(),
                        title: this.title,
                        completed: false
                    }

                    this.$emit('add-todo', newTodo)
                    this.title = ''
                }
            }
        }
    }
</script>

<style scoped>
    form {
        display: flex;
    }

    input {
        width: 400px;
    }
</style>