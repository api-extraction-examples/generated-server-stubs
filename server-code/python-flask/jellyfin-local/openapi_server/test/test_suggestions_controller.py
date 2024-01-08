import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSuggestionsController(BaseTestCase):
    """SuggestionsController integration test stubs"""

    def test_get_suggestions(self):
        """Test case for get_suggestions

        Gets suggestions.
        """
        query_string = [('mediaType', ['media_type_example']),
                        ('type', ['type_example']),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('enableTotalRecordCount', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Suggestions'.format(user_id='user_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
