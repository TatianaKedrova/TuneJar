<script>


    let value = ''
    let response = []
    let loading = false

    const handleInput = (event) =>
        value = event.target.value



</script>

<input
        placeholder="Search songs..."
        value={value}
        on:input={handleInput}
/>


{#if loading}
    <strong>Loading...</strong>
    {:else}
    {#each response as {CoverUrl, Title, Artist, Year}, index}
        {:else}
        <strong>No exist results</strong>
    {/each}
{/if}







