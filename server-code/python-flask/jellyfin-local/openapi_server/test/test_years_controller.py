import unittest

from flask import json

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestYearsController(BaseTestCase):
    """YearsController integration test stubs"""

    def test_get_year(self):
        """Test case for get_year

        Gets a year.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Years/{year}'.format(year=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_years(self):
        """Test case for get_years

        Get years.
        """
        query_string = [('startIndex', 56),
                        ('limit', 56),
                        ('sortOrder', 'sort_order_example'),
                        ('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('excludeItemTypes', ['exclude_item_types_example']),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('mediaTypes', ['media_types_example']),
                        ('sortBy', 'sort_by_example'),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('userId', 'user_id_example'),
                        ('recursive', True),
                        ('enableImages', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Years',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
