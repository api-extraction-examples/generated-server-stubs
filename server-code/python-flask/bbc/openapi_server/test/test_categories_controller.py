import unittest

from flask import json

from openapi_server.models.categories_response import CategoriesResponse  # noqa: E501
from openapi_server.models.category_error_response import CategoryErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCategoriesController(BaseTestCase):
    """CategoriesController integration test stubs"""

    def test_categories_get(self):
        """Test case for categories_get

        List of categories
        """
        query_string = [('kind', 'kind_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/categories',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_categories_id_get(self):
        """Test case for categories_id_get

        Category by ID
        """
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/categories/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
