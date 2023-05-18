<script>
    let value = ''
    let response = []
    let loading = false
    const handleInput = (event) =>
        value = event.target.value

    /*$: if (value.length > 2) {
        console.log(value)
        fetch(`http://localhost:8081E${value}/songs`)


        fetch(`http://img.omdbapi.com/?s=${value}&apikey=422350ff`)
            .then(res => res.json())
            .then(apiResponse => {
                response = apiResponse.Search || []
                loading = false

            })
    }*/

</script>

<input
        placeholder="Search movies..."
        value={value}
        on:input={handleInput}
/>

{#if loading}
    <strong>Loading...</strong>
    {:else}
    {#if response.length > 0}
        <strong>Excist ${response.length} movies</strong>
    {:else}
        <strong>Result no excist</strong>
    {/if}
{/if}



