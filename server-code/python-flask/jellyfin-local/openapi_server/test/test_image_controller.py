import unittest

from flask import json

from openapi_server.models.image_format import ImageFormat  # noqa: E501
from openapi_server.models.image_info import ImageInfo  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestImageController(BaseTestCase):
    """ImageController integration test stubs"""

    def test_delete_item_image(self):
        """Test case for delete_item_image

        Delete an item's image.
        """
        query_string = [('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}'.format(item_id='item_id_example', image_type=openapi_server.ImageType()),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_item_image_by_index(self):
        """Test case for delete_item_image_by_index

        Delete an item's image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_user_image(self):
        """Test case for delete_user_image

        Delete the user's image.
        """
        query_string = [('index', 56)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}'.format(user_id='user_id_example', image_type=openapi_server.ImageType()),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_user_image_by_index(self):
        """Test case for delete_user_image_by_index

        Delete the user's image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}/{index}'.format(user_id='user_id_example', image_type=openapi_server.ImageType(), index=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_artist_image(self):
        """Test case for get_artist_image

        Get artist image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Artists/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_genre_image(self):
        """Test case for get_genre_image

        Get genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Genres/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_genre_image_by_index(self):
        """Test case for get_genre_image_by_index

        Get genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Genres/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_image(self):
        """Test case for get_item_image

        Gets the item's image.
        """
        query_string = [('maxWidth', 56),
                        ('maxHeight', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('tag', 'tag_example'),
                        ('cropWhitespace', True),
                        ('format', openapi_server.ImageFormat()),
                        ('addPlayedIndicator', True),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}'.format(item_id='item_id_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_image2(self):
        """Test case for get_item_image2

        Gets the item's image.
        """
        query_string = [('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}/{tag}/{format}/{max_width}/{max_height}/{percent_played}/{unplayed_count}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), max_width=56, max_height=56, tag='tag_example', format=openapi_server.ImageFormat(), percent_played=3.4, unplayed_count=56, image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_image_by_index(self):
        """Test case for get_item_image_by_index

        Gets the item's image.
        """
        query_string = [('maxWidth', 56),
                        ('maxHeight', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('tag', 'tag_example'),
                        ('cropWhitespace', True),
                        ('format', openapi_server.ImageFormat()),
                        ('addPlayedIndicator', True),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item_image_infos(self):
        """Test case for get_item_image_infos

        Get item image infos.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_genre_image(self):
        """Test case for get_music_genre_image

        Get music genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/MusicGenres/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_genre_image_by_index(self):
        """Test case for get_music_genre_image_by_index

        Get music genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/MusicGenres/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_person_image(self):
        """Test case for get_person_image

        Get person image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Persons/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_person_image_by_index(self):
        """Test case for get_person_image_by_index

        Get person image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Persons/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_studio_image(self):
        """Test case for get_studio_image

        Get studio image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Studios/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_studio_image_by_index(self):
        """Test case for get_studio_image_by_index

        Get studio image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Studios/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_image(self):
        """Test case for get_user_image

        Get user profile image.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}'.format(user_id='user_id_example', image_type=openapi_server.ImageType()),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_image_by_index(self):
        """Test case for get_user_image_by_index

        Get user profile image.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}/{image_index}'.format(user_id='user_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_artist_image(self):
        """Test case for head_artist_image

        Get artist image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Artists/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_genre_image(self):
        """Test case for head_genre_image

        Get genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Genres/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_genre_image_by_index(self):
        """Test case for head_genre_image_by_index

        Get genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Genres/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_item_image(self):
        """Test case for head_item_image

        Gets the item's image.
        """
        query_string = [('maxWidth', 56),
                        ('maxHeight', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('tag', 'tag_example'),
                        ('cropWhitespace', True),
                        ('format', openapi_server.ImageFormat()),
                        ('addPlayedIndicator', True),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}'.format(item_id='item_id_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_item_image2(self):
        """Test case for head_item_image2

        Gets the item's image.
        """
        query_string = [('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}/{tag}/{format}/{max_width}/{max_height}/{percent_played}/{unplayed_count}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), max_width=56, max_height=56, tag='tag_example', format=openapi_server.ImageFormat(), percent_played=3.4, unplayed_count=56, image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_item_image_by_index(self):
        """Test case for head_item_image_by_index

        Gets the item's image.
        """
        query_string = [('maxWidth', 56),
                        ('maxHeight', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('tag', 'tag_example'),
                        ('cropWhitespace', True),
                        ('format', openapi_server.ImageFormat()),
                        ('addPlayedIndicator', True),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_music_genre_image(self):
        """Test case for head_music_genre_image

        Get music genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/MusicGenres/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_music_genre_image_by_index(self):
        """Test case for head_music_genre_image_by_index

        Get music genre image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/MusicGenres/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_person_image(self):
        """Test case for head_person_image

        Get person image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Persons/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_person_image_by_index(self):
        """Test case for head_person_image_by_index

        Get person image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Persons/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_studio_image(self):
        """Test case for head_studio_image

        Get studio image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Studios/{name}/Images/{image_type}'.format(name='name_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_studio_image_by_index(self):
        """Test case for head_studio_image_by_index

        Get studio image by name.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Studios/{name}/Images/{image_type}/{image_index}'.format(name='name_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_user_image(self):
        """Test case for head_user_image

        Get user profile image.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example'),
                        ('imageIndex', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}'.format(user_id='user_id_example', image_type=openapi_server.ImageType()),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_user_image_by_index(self):
        """Test case for head_user_image_by_index

        Get user profile image.
        """
        query_string = [('tag', 'tag_example'),
                        ('format', openapi_server.ImageFormat()),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('percentPlayed', 3.4),
                        ('unplayedCount', 56),
                        ('width', 56),
                        ('height', 56),
                        ('quality', 56),
                        ('cropWhitespace', True),
                        ('addPlayedIndicator', True),
                        ('blur', 56),
                        ('backgroundColor', 'background_color_example'),
                        ('foregroundLayer', 'foreground_layer_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}/{image_index}'.format(user_id='user_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_user_image(self):
        """Test case for post_user_image

        Sets the user image.
        """
        query_string = [('index', 56)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}'.format(user_id='user_id_example', image_type=openapi_server.ImageType()),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_user_image_by_index(self):
        """Test case for post_user_image_by_index

        Sets the user image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Images/{image_type}/{index}'.format(user_id='user_id_example', image_type=openapi_server.ImageType(), index=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_item_image(self):
        """Test case for set_item_image

        Set item image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}'.format(item_id='item_id_example', image_type=openapi_server.ImageType()),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_item_image_by_index(self):
        """Test case for set_item_image_by_index

        Set item image.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_item_image_index(self):
        """Test case for update_item_image_index

        Updates the index for an item image.
        """
        query_string = [('newIndex', 56)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Images/{image_type}/{image_index}/Index'.format(item_id='item_id_example', image_type=openapi_server.ImageType(), image_index=56),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
