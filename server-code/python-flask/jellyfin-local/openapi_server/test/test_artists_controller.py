import unittest

from flask import json

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.item_filter import ItemFilter  # noqa: E501
from openapi_server.test import BaseTestCase


class TestArtistsController(BaseTestCase):
    """ArtistsController integration test stubs"""

    def test_get_album_artists(self):
        """Test case for get_album_artists

        Gets all album artists from a given item, folder, or the entire library.
        """
        query_string = [('minCommunityRating', 3.4),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('searchTerm', 'search_term_example'),
                        ('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('excludeItemTypes', ['exclude_item_types_example']),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('filters', [openapi_server.ItemFilter()]),
                        ('isFavorite', True),
                        ('mediaTypes', ['media_types_example']),
                        ('genres', ['genres_example']),
                        ('genreIds', ['genre_ids_example']),
                        ('officialRatings', ['official_ratings_example']),
                        ('tags', ['tags_example']),
                        ('years', [56]),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('person', 'person_example'),
                        ('personIds', ['person_ids_example']),
                        ('personTypes', ['person_types_example']),
                        ('studios', ['studios_example']),
                        ('studioIds', ['studio_ids_example']),
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
            '/Artists/AlbumArtists',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_artist_by_name(self):
        """Test case for get_artist_by_name

        Gets an artist by name.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Artists/{name}'.format(name='name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_artists(self):
        """Test case for get_artists

        Gets all artists from a given item, folder, or the entire library.
        """
        query_string = [('minCommunityRating', 3.4),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('searchTerm', 'search_term_example'),
                        ('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('excludeItemTypes', ['exclude_item_types_example']),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('filters', [openapi_server.ItemFilter()]),
                        ('isFavorite', True),
                        ('mediaTypes', ['media_types_example']),
                        ('genres', ['genres_example']),
                        ('genreIds', ['genre_ids_example']),
                        ('officialRatings', ['official_ratings_example']),
                        ('tags', ['tags_example']),
                        ('years', [56]),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('person', 'person_example'),
                        ('personIds', ['person_ids_example']),
                        ('personTypes', ['person_types_example']),
                        ('studios', ['studios_example']),
                        ('studioIds', ['studio_ids_example']),
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
            '/Artists',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
