import unittest

from flask import json

from openapi_server.models.configuration_page_info import ConfigurationPageInfo  # noqa: E501
from openapi_server.models.configuration_page_type import ConfigurationPageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDashboardController(BaseTestCase):
    """DashboardController integration test stubs"""

    def test_get_configuration_pages(self):
        """Test case for get_configuration_pages

        Gets the configuration pages.
        """
        query_string = [('enableInMainMenu', True),
                        ('pageType', openapi_server.ConfigurationPageType())]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/web/ConfigurationPages',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dashboard_configuration_page(self):
        """Test case for get_dashboard_configuration_page

        Gets a dashboard configuration page.
        """
        query_string = [('name', 'name_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/web/ConfigurationPage',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
