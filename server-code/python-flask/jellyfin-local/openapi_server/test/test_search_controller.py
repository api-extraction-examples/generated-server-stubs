import unittest

from flask import json

from openapi_server.models.search_hint_result import SearchHintResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSearchController(BaseTestCase):
    """SearchController integration test stubs"""

    def test_get(self):
        """Test case for get

        Gets the search hint result.
        """
        query_string = [('startIndex', 56),
                        ('limit', 56),
                        ('userId', 'user_id_example'),
                        ('searchTerm', 'search_term_example'),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('excludeItemTypes', ['exclude_item_types_example']),
                        ('mediaTypes', ['media_types_example']),
                        ('parentId', 'parent_id_example'),
                        ('isMovie', True),
                        ('isSeries', True),
                        ('isNews', True),
                        ('isKids', True),
                        ('isSports', True),
                        ('includePeople', True),
                        ('includeMedia', True),
                        ('includeGenres', True),
                        ('includeStudios', True),
                        ('includeArtists', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Search/Hints',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
