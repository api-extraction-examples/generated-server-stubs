import unittest

from flask import json

from openapi_server.models.app_categories_response import AppCategoriesResponse  # noqa: E501
from openapi_server.models.app_category_response import AppCategoryResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppCategoriesController(BaseTestCase):
    """AppCategoriesController integration test stubs"""

    def test_app_categories_get_collection(self):
        """Test case for app_categories_get_collection

        
        """
        query_string = [('filter[platforms]', ['filter_platforms_example']),
                        ('exists[parent]', ['exists_parent_example']),
                        ('fields[appCategories]', ['fields_app_categories_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('limit[subcategories]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appCategories',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_categories_get_instance(self):
        """Test case for app_categories_get_instance

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example']),
                        ('include', ['include_example']),
                        ('limit[subcategories]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appCategories/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_categories_parent_get_to_one_related(self):
        """Test case for app_categories_parent_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appCategories/{id}/parent'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_categories_subcategories_get_to_many_related(self):
        """Test case for app_categories_subcategories_get_to_many_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appCategories/{id}/subcategories'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
