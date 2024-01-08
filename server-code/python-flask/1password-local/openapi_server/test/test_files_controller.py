import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.file import File  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFilesController(BaseTestCase):
    """FilesController integration test stubs"""

    def test_download_file_by_id(self):
        """Test case for download_file_by_id

        Get the content of a File
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}/files/{file_uuid}/content'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example', file_uuid='file_uuid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_details_of_file_by_id(self):
        """Test case for get_details_of_file_by_id

        Get the details of a File
        """
        query_string = [('inline_files', true)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}/files/{file_uuid}'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example', file_uuid='file_uuid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_files(self):
        """Test case for get_item_files

        Get all the files inside an Item
        """
        query_string = [('inline_files', true)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}/files'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
