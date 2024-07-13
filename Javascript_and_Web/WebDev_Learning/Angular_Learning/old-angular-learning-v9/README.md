# Learning Old Angular (v9.0.0)

An overview of an older version of the Angular framework.

**Why a separate learning project for old Angular?**\
Since Angular has changed substantially over the years, and most companies are still using older versions of Angular, it's important to understand the older versions of Angular.\
The differences between the versions are substantial enough to make a seperate learing project for this version.

**NOTE: PARTIAL TUTORIAL!**\
This a partial tutorial only covering the specific differences in the old versions from the new ones. Learn about the angular basics from the [modern angular-learning project](https://github.com/NaspoDev/Learning-Projects-VsCode/tree/main/WebDev_Learning/Angular_Learning/angular-learning).

## Project Structure

### End to End Folder (`e2e/`)

The `e2e/` directory holds our **end-to-end** test logic.

End-to-end tests are tests that simulate a real user.\
Here we can write code to:

- Launch our browser
- Simulate links being clicked
- Fill out a form
- Click a button
- etc...

### Source folder (`src/`)

- `app/`: Inside the app folder we have our modules and components.
  - The `app/` folder itself is a module, as you can see by the `app.module.ts` file.
- `assets/`: Where we store static assets.
- `environments/`. Where we store configuration settings for different environments (prod, dev).
- **main.ts**: The entry point to our application. Calls to render the app.
- **polyfills.ts**: Adds certain functionalities that Angular needs that some browsers may not support.
- **styles.css/scss**: Where we add global styles for our application.
- **test.ts**: Test configurations for our application.

### Root Project Files

(Not defining the self-explanatory ones).

**angular.json**\
Angular CLI configuration. Includes configuration options for build, serve, and test tools that the CLI uses, such as [Karma](https://karma-runner.github.io/latest/index.html), and [Protractor](https://www.protractortest.org/#/). For details, see [Angular Workspace Configuration](https://angular.io/guide/workspace-config).

**karma-conf.js**\
Karma is a javascript test runner, this is it's config.

## Other Notes

### Modules

A module is a container for related components.

- Every Angular app has at least one Module, which we call App Module.
- A module is a class defined in a `.module.ts` file, annotated with a `@NgModule` decorator.
- Whenever a new component is added to a module, it must be declared in the module file.
