// cypress/integration/sample.spec.js

describe('Sample Test Suite', () => {
  beforeEach(() => {
    cy.visit('https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/')
  })

  it('should verify the title of the page', () => {
    cy.title().should('eq', 'Want to Practice Test Automation? Try These Demo Sites!')
  })

  it('should click on Speaking and verify the title of the page', () => {
    cy.contains('Speaking').click()
    cy.title().should('eq', 'Speaking')
  })

  it('should verify if Keynote Addresses is present and its text', () => {
    cy.contains('Keynote Addresses').should('exist')
    cy.contains('Keynote Addresses').invoke('text').should('include', 'Keynote Addresses')
  })
})
