
<script>
    let name  = "TuneJar"

    function handleClick () {
        name = 'Hola'
    }

    let value = ''

    const handleInput = (event) =>
        value = event.target.value

    $: {
        console.log(value)
    }

</script>



<header>
    <div class="header">
        <img src="/images/logo.png" alt="Logo">
        <div class="input">
            <!--<input value={value} on:input={handleInput}/>
            <button on:click={handleClick}>Search</button>-->
        </div>

    </div>
</header>



<style>
    .header {
        position: relative;
        display: flex;
        justify-content: space-between;
        padding: 42px;
    }
    .input{
       margin: 40px;
    }
</style>


