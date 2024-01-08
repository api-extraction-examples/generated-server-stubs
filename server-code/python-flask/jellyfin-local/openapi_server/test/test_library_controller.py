import unittest

from flask import json

from openapi_server.models.all_theme_media_result import AllThemeMediaResult  # noqa: E501
from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.item_counts import ItemCounts  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.library_options_result_dto import LibraryOptionsResultDto  # noqa: E501
from openapi_server.models.media_update_info_dto import MediaUpdateInfoDto  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.theme_media_result import ThemeMediaResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLibraryController(BaseTestCase):
    """LibraryController integration test stubs"""

    def test_delete_item(self):
        """Test case for delete_item

        Deletes an item from the library and filesystem.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}'.format(item_id='item_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_items(self):
        """Test case for delete_items

        Deletes items from the library and filesystem.
        """
        query_string = [('ids', ['ids_example'])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ancestors(self):
        """Test case for get_ancestors

        Gets all parents of an item.
        """
        query_string = [('userId', 'user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Ancestors'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_critic_reviews(self):
        """Test case for get_critic_reviews

        Gets critic review for an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/CriticReviews'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_download(self):
        """Test case for get_download

        Downloads item media.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Download'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_file(self):
        """Test case for get_file

        Get the original file of an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/File'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_counts(self):
        """Test case for get_item_counts

        Get item counts.
        """
        query_string = [('userId', 'user_id_example'),
                        ('isFavorite', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/Counts',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_library_options_info(self):
        """Test case for get_library_options_info

        Gets the library options info.
        """
        query_string = [('libraryContentType', 'library_content_type_example'),
                        ('isNewLibrary', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Libraries/AvailableOptions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_folders(self):
        """Test case for get_media_folders

        Gets all user media folders.
        """
        query_string = [('isHidden', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/MediaFolders',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_physical_paths(self):
        """Test case for get_physical_paths

        Gets a list of physical paths from virtual folders.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/PhysicalPaths',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_albums(self):
        """Test case for get_similar_albums

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Albums/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_artists(self):
        """Test case for get_similar_artists

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Artists/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_items(self):
        """Test case for get_similar_items

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_movies(self):
        """Test case for get_similar_movies

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Movies/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_shows(self):
        """Test case for get_similar_shows

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Shows/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_similar_trailers(self):
        """Test case for get_similar_trailers

        Gets similar items.
        """
        query_string = [('excludeArtistIds', ['exclude_artist_ids_example']),
                        ('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Trailers/{item_id}/Similar'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_theme_media(self):
        """Test case for get_theme_media

        Get theme songs and videos for an item.
        """
        query_string = [('userId', 'user_id_example'),
                        ('inheritFromParent', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/ThemeMedia'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_theme_songs(self):
        """Test case for get_theme_songs

        Get theme songs for an item.
        """
        query_string = [('userId', 'user_id_example'),
                        ('inheritFromParent', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/ThemeSongs'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_theme_videos(self):
        """Test case for get_theme_videos

        Get theme videos for an item.
        """
        query_string = [('userId', 'user_id_example'),
                        ('inheritFromParent', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/ThemeVideos'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_added_movies(self):
        """Test case for post_added_movies

        Reports that new movies have been added by an external source.
        """
        query_string = [('tmdbId', 'tmdb_id_example'),
                        ('imdbId', 'imdb_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Movies/Added',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_added_series(self):
        """Test case for post_added_series

        Reports that new episodes of a series have been added by an external source.
        """
        query_string = [('tvdbId', 'tvdb_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Series/Added',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_post_updated_media(self):
        """Test case for post_updated_media

        Reports that new movies have been added by an external source.
        """
        media_update_info_dto = {"Path":"Path","UpdateType":"UpdateType"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Media/Updated',
            method='POST',
            headers=headers,
            data=json.dumps(media_update_info_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_updated_movies(self):
        """Test case for post_updated_movies

        Reports that new movies have been added by an external source.
        """
        query_string = [('tmdbId', 'tmdb_id_example'),
                        ('imdbId', 'imdb_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Movies/Updated',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_updated_series(self):
        """Test case for post_updated_series

        Reports that new episodes of a series have been added by an external source.
        """
        query_string = [('tvdbId', 'tvdb_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Series/Updated',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_refresh_library(self):
        """Test case for refresh_library

        Starts a library scan.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/Refresh',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
