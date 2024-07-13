# Learning Angular

An overview of the Angular framework.

## Project Structure

### Source folder (`src/`)

- `app/`: Inside the app folder we have our modules and components.
- `assets/`: Where we store static assets.
- **main.ts**: The entry point to our application. Calls to render the app.
- **polyfills.ts**: Adds certain functionalities that Angular needs that some browsers may not support.
- **styles.css/scss**: Where we add global styles for our application.
- **test.ts**: Test configurations for our application.

### Root Project Files

(Not defining the self-explanatory ones).

**angular.json**\
Angular CLI configuration. Includes configuration options for build, serve, and test tools that the CLI uses, such as [Karma](https://karma-runner.github.io/latest/index.html), and [Protractor](https://www.protractortest.org/#/). For details, see [Angular Workspace Configuration](https://angular.io/guide/workspace-config).

## Things from Older Versions of Angular (Overview)

_If you want to learn the specifics differences with the older versions of Angular,_
\*visit the [v9 angular learning project](https://github.com/NaspoDev/Learning-Projects-VsCode/tree/main/WebDev_Learning/Angular_Learning/old-angular-learning-v9).

Angular has changed a fair amount over the years. In case you find yourself working\
with older versions of Angular, maybe at a job, here are some things you might see.

### Modules (Below v17)

A module is a container for related components.

- Every Angular app has at least one Module, which we call App Module.
- A module is a class defined in a `.module.ts` file, annotated with a `@NgModule` decorator.
- Whenever a new component is added to a module, it must be declared in the module file.

### End to End Folder (`e2e/`)

The `e2e/` directory holds our **end-to-end** test logic.

End-to-end tests are tests that simulate a real user.\
Here we can write code to:

- Launch our browser
- Simulate links being clicked
- Fill out a form
- Click a button
- etc...

### Other Notes

- `src/app` is a Module. The `app/` folder itself is a module, as you can see by the `app.module.ts` file.
- `src/environments/`. Where we store configuration settings for different environments (prod, dev).
- **karma-conf.js**: Karma is a javascript test runner, this is it's config.
