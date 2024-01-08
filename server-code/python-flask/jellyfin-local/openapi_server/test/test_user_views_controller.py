import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.special_view_option_dto import SpecialViewOptionDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserViewsController(BaseTestCase):
    """UserViewsController integration test stubs"""

    def test_get_grouping_options(self):
        """Test case for get_grouping_options

        Get user view grouping options.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/GroupingOptions'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_views(self):
        """Test case for get_user_views

        Get user views.
        """
        query_string = [('includeExternalContent', True),
                        ('presetViews', ['preset_views_example']),
                        ('includeHidden', False)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Views'.format(user_id='user_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
