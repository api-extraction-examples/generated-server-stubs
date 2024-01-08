import unittest

from flask import json

from openapi_server.models.album_info_remote_search_query import AlbumInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.artist_info_remote_search_query import ArtistInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.book_info_remote_search_query import BookInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.box_set_info_remote_search_query import BoxSetInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.external_id_info import ExternalIdInfo  # noqa: E501
from openapi_server.models.movie_info_remote_search_query import MovieInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.music_video_info_remote_search_query import MusicVideoInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.person_lookup_info_remote_search_query import PersonLookupInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_search_result import RemoteSearchResult  # noqa: E501
from openapi_server.models.series_info_remote_search_query import SeriesInfoRemoteSearchQuery  # noqa: E501
from openapi_server.models.trailer_info_remote_search_query import TrailerInfoRemoteSearchQuery  # noqa: E501
from openapi_server.test import BaseTestCase


class TestItemLookupController(BaseTestCase):
    """ItemLookupController integration test stubs"""

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_apply_search_criteria(self):
        """Test case for apply_search_criteria

        Applies search criteria to an item and refreshes metadata.
        """
        remote_search_result = {"IndexNumberEnd":6,"ProductionYear":5,"PremiereDate":"2000-01-23T04:56:07.000+00:00","ImageUrl":"ImageUrl","IndexNumber":0,"Overview":"Overview","ParentIndexNumber":1,"SearchProviderName":"SearchProviderName","Artists":[null,null],"ProviderIds":{"key":"ProviderIds"},"Name":"Name"}
        query_string = [('replaceAllImages', True)]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Apply/{item_id}'.format(item_id='item_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(remote_search_result),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_book_remote_search_results(self):
        """Test case for get_book_remote_search_results

        Get book remote search.
        """
        book_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","SeriesName":"SeriesName","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Book',
            method='POST',
            headers=headers,
            data=json.dumps(book_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_box_set_remote_search_results(self):
        """Test case for get_box_set_remote_search_results

        Get box set remote search.
        """
        box_set_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/BoxSet',
            method='POST',
            headers=headers,
            data=json.dumps(box_set_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_external_id_infos(self):
        """Test case for get_external_id_infos

        Get the item's external id info.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/ExternalIdInfos'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_movie_remote_search_results(self):
        """Test case for get_movie_remote_search_results

        Get movie remote search.
        """
        movie_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Movie',
            method='POST',
            headers=headers,
            data=json.dumps(movie_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_music_album_remote_search_results(self):
        """Test case for get_music_album_remote_search_results

        Get music album remote search.
        """
        album_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","PremiereDate":"2000-01-23T04:56:07.000+00:00","SongInfos":[{"Path":"Path","MetadataLanguage":"MetadataLanguage","PremiereDate":"2000-01-23T04:56:07.000+00:00","Album":"Album","MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":5,"IsAutomated":True,"Name":"Name","AlbumArtists":["AlbumArtists","AlbumArtists"],"Year":5,"IndexNumber":1,"Artists":["Artists","Artists"],"ProviderIds":{"key":"ProviderIds"}},{"Path":"Path","MetadataLanguage":"MetadataLanguage","PremiereDate":"2000-01-23T04:56:07.000+00:00","Album":"Album","MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":5,"IsAutomated":True,"Name":"Name","AlbumArtists":["AlbumArtists","AlbumArtists"],"Year":5,"IndexNumber":1,"Artists":["Artists","Artists"],"ProviderIds":{"key":"ProviderIds"}}],"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ArtistProviderIds":{"key":"ArtistProviderIds"},"IsAutomated":True,"Name":"Name","AlbumArtists":["AlbumArtists","AlbumArtists"],"Year":2,"IndexNumber":0,"ProviderIds":{"key":"ProviderIds"}},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/MusicAlbum',
            method='POST',
            headers=headers,
            data=json.dumps(album_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_music_artist_remote_search_results(self):
        """Test case for get_music_artist_remote_search_results

        Get music artist remote search.
        """
        artist_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"SongInfos":[{"Path":"Path","MetadataLanguage":"MetadataLanguage","PremiereDate":"2000-01-23T04:56:07.000+00:00","Album":"Album","MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":5,"IsAutomated":True,"Name":"Name","AlbumArtists":["AlbumArtists","AlbumArtists"],"Year":5,"IndexNumber":1,"Artists":["Artists","Artists"],"ProviderIds":{"key":"ProviderIds"}},{"Path":"Path","MetadataLanguage":"MetadataLanguage","PremiereDate":"2000-01-23T04:56:07.000+00:00","Album":"Album","MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":5,"IsAutomated":True,"Name":"Name","AlbumArtists":["AlbumArtists","AlbumArtists"],"Year":5,"IndexNumber":1,"Artists":["Artists","Artists"],"ProviderIds":{"key":"ProviderIds"}}],"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/MusicArtist',
            method='POST',
            headers=headers,
            data=json.dumps(artist_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_music_video_remote_search_results(self):
        """Test case for get_music_video_remote_search_results

        Get music video remote search.
        """
        music_video_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"Artists":["Artists","Artists"],"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/MusicVideo',
            method='POST',
            headers=headers,
            data=json.dumps(music_video_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_person_remote_search_results(self):
        """Test case for get_person_remote_search_results

        Get person remote search.
        """
        person_lookup_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Person',
            method='POST',
            headers=headers,
            data=json.dumps(person_lookup_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_search_image(self):
        """Test case for get_remote_search_image

        Gets a remote image.
        """
        query_string = [('imageUrl', 'image_url_example'),
                        ('providerName', 'provider_name_example')]
        headers = { 
            'Accept': 'image/*',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Image',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_series_remote_search_results(self):
        """Test case for get_series_remote_search_results

        Get series remote search.
        """
        series_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Series',
            method='POST',
            headers=headers,
            data=json.dumps(series_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_get_trailer_remote_search_results(self):
        """Test case for get_trailer_remote_search_results

        Get trailer remote search.
        """
        trailer_info_remote_search_query = {"SearchInfo":{"Path":"Path","MetadataLanguage":"MetadataLanguage","Year":1,"PremiereDate":"2000-01-23T04:56:07.000+00:00","IndexNumber":0,"MetadataCountryCode":"MetadataCountryCode","ParentIndexNumber":6,"ProviderIds":{"key":"ProviderIds"},"IsAutomated":True,"Name":"Name"},"IncludeDisabledProviders":True,"SearchProviderName":"SearchProviderName","ItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/RemoteSearch/Trailer',
            method='POST',
            headers=headers,
            data=json.dumps(trailer_info_remote_search_query),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
