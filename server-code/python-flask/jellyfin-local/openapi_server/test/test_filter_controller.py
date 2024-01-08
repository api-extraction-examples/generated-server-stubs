import unittest

from flask import json

from openapi_server.models.query_filters import QueryFilters  # noqa: E501
from openapi_server.models.query_filters_legacy import QueryFiltersLegacy  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFilterController(BaseTestCase):
    """FilterController integration test stubs"""

    def test_get_query_filters(self):
        """Test case for get_query_filters

        Gets query filters.
        """
        query_string = [('userId', 'user_id_example'),
                        ('parentId', 'parent_id_example'),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('isAiring', True),
                        ('isMovie', True),
                        ('isSports', True),
                        ('isKids', True),
                        ('isNews', True),
                        ('isSeries', True),
                        ('recursive', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/Filters2',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_query_filters_legacy(self):
        """Test case for get_query_filters_legacy

        Gets legacy query filters.
        """
        query_string = [('userId', 'user_id_example'),
                        ('parentId', 'parent_id_example'),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('mediaTypes', ['media_types_example'])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/Filters',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
