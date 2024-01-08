import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_portfolio_membership200_response import GetPortfolioMembership200Response  # noqa: E501
from openapi_server.models.get_portfolio_memberships200_response import GetPortfolioMemberships200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPortfolioMembershipsController(BaseTestCase):
    """PortfolioMembershipsController integration test stubs"""

    def test_get_portfolio_membership(self):
        """Test case for get_portfolio_membership

        Get a portfolio membership
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolio_memberships/{portfolio_membership_gid}'.format(portfolio_membership_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_portfolio_memberships(self):
        """Test case for get_portfolio_memberships

        Get multiple portfolio memberships
        """
        query_string = [('portfolio', '12345'),
                        ('workspace', '12345'),
                        ('user', 'me'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolio_memberships',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_portfolio_memberships_for_portfolio(self):
        """Test case for get_portfolio_memberships_for_portfolio

        Get memberships from a portfolio
        """
        query_string = [('user', 'me'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/portfolio_memberships'.format(portfolio_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
