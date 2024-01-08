import unittest

from flask import json

from openapi_server.models.add_custom_field_setting_for_portfolio200_response import AddCustomFieldSettingForPortfolio200Response  # noqa: E501
from openapi_server.models.add_custom_field_setting_for_portfolio_request import AddCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.add_item_for_portfolio_request import AddItemForPortfolioRequest  # noqa: E501
from openapi_server.models.add_members_for_portfolio_request import AddMembersForPortfolioRequest  # noqa: E501
from openapi_server.models.create_portfolio201_response import CreatePortfolio201Response  # noqa: E501
from openapi_server.models.create_portfolio_request import CreatePortfolioRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_items_for_portfolio200_response import GetItemsForPortfolio200Response  # noqa: E501
from openapi_server.models.get_portfolios200_response import GetPortfolios200Response  # noqa: E501
from openapi_server.models.remove_custom_field_setting_for_portfolio_request import RemoveCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.remove_item_for_portfolio_request import RemoveItemForPortfolioRequest  # noqa: E501
from openapi_server.models.remove_members_for_portfolio_request import RemoveMembersForPortfolioRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPortfoliosController(BaseTestCase):
    """PortfoliosController integration test stubs"""

    def test_add_custom_field_setting_for_portfolio(self):
        """Test case for add_custom_field_setting_for_portfolio

        Add a custom field to a portfolio
        """
        add_custom_field_setting_for_portfolio_request = openapi_server.AddCustomFieldSettingForPortfolioRequest()
        query_string = [('opt_pretty', true)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/addCustomFieldSetting'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_custom_field_setting_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_item_for_portfolio(self):
        """Test case for add_item_for_portfolio

        Add a portfolio item
        """
        add_item_for_portfolio_request = openapi_server.AddItemForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/addItem'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_item_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_members_for_portfolio(self):
        """Test case for add_members_for_portfolio

        Add users to a portfolio
        """
        add_members_for_portfolio_request = openapi_server.AddMembersForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/addMembers'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_members_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_portfolio(self):
        """Test case for create_portfolio

        Create a portfolio
        """
        create_portfolio_request = openapi_server.CreatePortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios',
            method='POST',
            headers=headers,
            data=json.dumps(create_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_portfolio(self):
        """Test case for delete_portfolio

        Delete a portfolio
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}'.format(portfolio_gid='12345'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_items_for_portfolio(self):
        """Test case for get_items_for_portfolio

        Get portfolio items
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/items'.format(portfolio_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_portfolio(self):
        """Test case for get_portfolio

        Get a portfolio
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}'.format(portfolio_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_portfolios(self):
        """Test case for get_portfolios

        Get multiple portfolios
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('workspace', '1331'),
                        ('owner', '14916')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_custom_field_setting_for_portfolio(self):
        """Test case for remove_custom_field_setting_for_portfolio

        Remove a custom field from a portfolio
        """
        remove_custom_field_setting_for_portfolio_request = openapi_server.RemoveCustomFieldSettingForPortfolioRequest()
        query_string = [('opt_pretty', true)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/removeCustomFieldSetting'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_custom_field_setting_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_item_for_portfolio(self):
        """Test case for remove_item_for_portfolio

        Remove a portfolio item
        """
        remove_item_for_portfolio_request = openapi_server.RemoveItemForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/removeItem'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_item_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_members_for_portfolio(self):
        """Test case for remove_members_for_portfolio

        Remove users from a portfolio
        """
        remove_members_for_portfolio_request = openapi_server.RemoveMembersForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}/removeMembers'.format(portfolio_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_members_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_portfolio(self):
        """Test case for update_portfolio

        Update a portfolio
        """
        create_portfolio_request = openapi_server.CreatePortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/portfolios/{portfolio_gid}'.format(portfolio_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
