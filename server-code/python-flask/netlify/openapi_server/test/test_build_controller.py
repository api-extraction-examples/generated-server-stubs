import unittest

from flask import json

from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.build_setup import BuildSetup  # noqa: E501
from openapi_server.models.build_status import BuildStatus  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildController(BaseTestCase):
    """BuildController integration test stubs"""

    def test_create_site_build(self):
        """Test case for create_site_build

        
        """
        build = openapi_server.BuildSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/builds'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(build),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_account_build_status(self):
        """Test case for get_account_build_status

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_id}/builds/status'.format(account_id='account_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site_build(self):
        """Test case for get_site_build

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/builds/{build_id}'.format(build_id='build_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_builds(self):
        """Test case for list_site_builds

        
        """
        query_string = [('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/builds'.format(site_id='site_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_notify_build_start(self):
        """Test case for notify_build_start

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/builds/{build_id}/start'.format(build_id='build_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
