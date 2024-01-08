import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.split_test import SplitTest  # noqa: E501
from openapi_server.models.split_test_setup import SplitTestSetup  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSplitTestController(BaseTestCase):
    """SplitTestController integration test stubs"""

    def test_create_split_test(self):
        """Test case for create_split_test

        
        """
        branch_tests = openapi_server.SplitTestSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(branch_tests),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_disable_split_test(self):
        """Test case for disable_split_test

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits/{split_test_id}/unpublish'.format(site_id='site_id_example', split_test_id='split_test_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_enable_split_test(self):
        """Test case for enable_split_test

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits/{split_test_id}/publish'.format(site_id='site_id_example', split_test_id='split_test_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_split_test(self):
        """Test case for get_split_test

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits/{split_test_id}'.format(site_id='site_id_example', split_test_id='split_test_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_split_tests(self):
        """Test case for get_split_tests

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_split_test(self):
        """Test case for update_split_test

        
        """
        branch_tests = openapi_server.SplitTestSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/traffic_splits/{split_test_id}'.format(site_id='site_id_example', split_test_id='split_test_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(branch_tests),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
