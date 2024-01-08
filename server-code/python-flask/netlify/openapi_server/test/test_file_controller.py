import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFileController(BaseTestCase):
    """FileController integration test stubs"""

    def test_get_site_file_by_path_name(self):
        """Test case for get_site_file_by_path_name

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/files/{file_path}'.format(site_id='site_id_example', file_path='file_path_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_files(self):
        """Test case for list_site_files

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/files'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/octet-stream not supported by Connexion")
    def test_upload_deploy_file(self):
        """Test case for upload_deploy_file

        
        """
        file_body = '/path/to/file'
        query_string = [('size', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/octet-stream',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/files/{path}'.format(deploy_id='deploy_id_example', path='path_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(file_body),
            content_type='application/octet-stream',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
