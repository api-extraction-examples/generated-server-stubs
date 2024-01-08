import unittest

from flask import json

from openapi_server.models.collection_creation_result import CollectionCreationResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCollectionController(BaseTestCase):
    """CollectionController integration test stubs"""

    def test_add_to_collection(self):
        """Test case for add_to_collection

        Adds items to a collection.
        """
        query_string = [('ids', ['ids_example'])]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Collections/{collection_id}/Items'.format(collection_id='collection_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_collection(self):
        """Test case for create_collection

        Creates a new collection.
        """
        query_string = [('name', 'name_example'),
                        ('ids', ['ids_example']),
                        ('parentId', 'parent_id_example'),
                        ('isLocked', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Collections',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_from_collection(self):
        """Test case for remove_from_collection

        Removes items from a collection.
        """
        query_string = [('ids', ['ids_example'])]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Collections/{collection_id}/Items'.format(collection_id='collection_id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
