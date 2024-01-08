import unittest

from flask import json

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStudiosController(BaseTestCase):
    """StudiosController integration test stubs"""

    def test_get_studio(self):
        """Test case for get_studio

        Gets a studio by name.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Studios/{name}'.format(name='name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_studios(self):
        """Test case for get_studios

        Gets all studios from a given item, folder, or the entire library.
        """
        query_string = [('startIndex', 56),
                        ('limit', 56),
                        ('searchTerm', 'search_term_example'),
                        ('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('excludeItemTypes', ['exclude_item_types_example']),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('isFavorite', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('userId', 'user_id_example'),
                        ('nameStartsWithOrGreater', 'name_starts_with_or_greater_example'),
                        ('nameStartsWith', 'name_starts_with_example'),
                        ('nameLessThan', 'name_less_than_example'),
                        ('enableImages', True),
                        ('enableTotalRecordCount', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Studios',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
