import { Com.Chillbaby.ClibootframeworkPage } from './app.po';

describe('com.chillbaby.clibootframework App', () => {
  let page: Com.Chillbaby.ClibootframeworkPage;

  beforeEach(() => {
    page = new Com.Chillbaby.ClibootframeworkPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
