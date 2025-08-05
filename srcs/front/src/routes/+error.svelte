<script lang="ts">
  export let error: Error & {status?: number};
</script>
<main class="container">
  <h1>{error?.message ?? 'ERROR'}</h1>
  <a href="/">Go to home</a>
</main>
<!-- no sale tt -->