import unittest

from flask import json

from openapi_server.models.status_category import StatusCategory  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowStatusCategoriesController(BaseTestCase):
    """WorkflowStatusCategoriesController integration test stubs"""

    def test_get_status_categories(self):
        """Test case for get_status_categories

        Get all status categories
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuscategory',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_status_category(self):
        """Test case for get_status_category

        Get status category
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuscategory/{id_or_key}'.format(id_or_key='id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
