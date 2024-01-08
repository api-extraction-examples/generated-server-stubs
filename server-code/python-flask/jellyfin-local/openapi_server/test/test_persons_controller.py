import unittest

from flask import json

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.item_filter import ItemFilter  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPersonsController(BaseTestCase):
    """PersonsController integration test stubs"""

    def test_get_person(self):
        """Test case for get_person

        Get person by name.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Persons/{name}'.format(name='name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_persons(self):
        """Test case for get_persons

        Gets all persons.
        """
        query_string = [('limit', 56),
                        ('searchTerm', 'search_term_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('filters', [openapi_server.ItemFilter()]),
                        ('isFavorite', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('excludePersonTypes', ['exclude_person_types_example']),
                        ('personTypes', ['person_types_example']),
                        ('appearsInItemId', 'appears_in_item_id_example'),
                        ('userId', 'user_id_example'),
                        ('enableImages', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Persons',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
