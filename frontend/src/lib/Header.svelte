
<script>

    function handleClick () {
        name = 'Movies'
    }
</script>



<header>
    <div>
        <img src="/images/logo.png" alt="Logo">
        <h1>Hello {name}</h1>
        <button on:click={handleClick}>Search</button>
    </div>
</header>



<style>
    div{
        padding: 42px;
        display: flex;
        justify-content: space-between;
    }
</style>


