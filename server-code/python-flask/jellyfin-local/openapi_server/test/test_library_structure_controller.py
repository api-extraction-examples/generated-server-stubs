import unittest

from flask import json

from openapi_server.models.add_virtual_folder_dto import AddVirtualFolderDto  # noqa: E501
from openapi_server.models.media_path_dto import MediaPathDto  # noqa: E501
from openapi_server.models.media_path_info import MediaPathInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.update_library_options_dto import UpdateLibraryOptionsDto  # noqa: E501
from openapi_server.models.virtual_folder_info import VirtualFolderInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLibraryStructureController(BaseTestCase):
    """LibraryStructureController integration test stubs"""

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_add_media_path(self):
        """Test case for add_media_path

        Add a media path to a library.
        """
        media_path_dto = {"Path":"Path","PathInfo":{"Path":"Path","NetworkPath":"NetworkPath"},"Name":"Name"}
        query_string = [('refreshLibrary', False)]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders/Paths',
            method='POST',
            headers=headers,
            data=json.dumps(media_path_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_add_virtual_folder(self):
        """Test case for add_virtual_folder

        Adds a virtual folder.
        """
        add_virtual_folder_dto = {"LibraryOptions":{"SaveSubtitlesWithMedia":True,"EnableInternetProviders":True,"MetadataCountryCode":"MetadataCountryCode","MetadataSavers":["MetadataSavers","MetadataSavers"],"SaveLocalMetadata":True,"SeasonZeroDisplayName":"SeasonZeroDisplayName","EnableEmbeddedTitles":True,"EnableChapterImageExtraction":True,"AutomaticRefreshIntervalDays":0,"SubtitleFetcherOrder":["SubtitleFetcherOrder","SubtitleFetcherOrder"],"TypeOptions":[{"Type":"Type","MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ImageFetchers":["ImageFetchers","ImageFetchers"],"ImageOptions":[{"Limit":0,"MinWidth":6},{"Limit":0,"MinWidth":6}],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"MetadataFetchers":["MetadataFetchers","MetadataFetchers"]},{"Type":"Type","MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ImageFetchers":["ImageFetchers","ImageFetchers"],"ImageOptions":[{"Limit":0,"MinWidth":6},{"Limit":0,"MinWidth":6}],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"MetadataFetchers":["MetadataFetchers","MetadataFetchers"]}],"EnableRealtimeMonitor":True,"EnableAutomaticSeriesGrouping":True,"ExtractChapterImagesDuringLibraryScan":True,"SubtitleDownloadLanguages":["SubtitleDownloadLanguages","SubtitleDownloadLanguages"],"DisabledLocalMetadataReaders":["DisabledLocalMetadataReaders","DisabledLocalMetadataReaders"],"PreferredMetadataLanguage":"PreferredMetadataLanguage","EnableEmbeddedEpisodeInfos":True,"SkipSubtitlesIfAudioTrackMatches":True,"RequirePerfectSubtitleMatch":True,"EnablePhotos":True,"SkipSubtitlesIfEmbeddedSubtitlesPresent":True,"DisabledSubtitleFetchers":["DisabledSubtitleFetchers","DisabledSubtitleFetchers"],"PathInfos":[{"Path":"Path","NetworkPath":"NetworkPath"},{"Path":"Path","NetworkPath":"NetworkPath"}],"LocalMetadataReaderOrder":["LocalMetadataReaderOrder","LocalMetadataReaderOrder"]}}
        query_string = [('name', 'name_example'),
                        ('collectionType', 'collection_type_example'),
                        ('paths', ['paths_example']),
                        ('refreshLibrary', False)]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders',
            method='POST',
            headers=headers,
            data=json.dumps(add_virtual_folder_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_virtual_folders(self):
        """Test case for get_virtual_folders

        Gets all virtual folders.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_media_path(self):
        """Test case for remove_media_path

        Remove a media path.
        """
        query_string = [('name', 'name_example'),
                        ('path', 'path_example'),
                        ('refreshLibrary', False)]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders/Paths',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_virtual_folder(self):
        """Test case for remove_virtual_folder

        Removes a virtual folder.
        """
        query_string = [('name', 'name_example'),
                        ('refreshLibrary', False)]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_rename_virtual_folder(self):
        """Test case for rename_virtual_folder

        Renames a virtual folder.
        """
        query_string = [('name', 'name_example'),
                        ('newName', 'new_name_example'),
                        ('refreshLibrary', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders/Name',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_library_options(self):
        """Test case for update_library_options

        Update library options.
        """
        update_library_options_dto = {"LibraryOptions":{"SaveSubtitlesWithMedia":True,"EnableInternetProviders":True,"MetadataCountryCode":"MetadataCountryCode","MetadataSavers":["MetadataSavers","MetadataSavers"],"SaveLocalMetadata":True,"SeasonZeroDisplayName":"SeasonZeroDisplayName","EnableEmbeddedTitles":True,"EnableChapterImageExtraction":True,"AutomaticRefreshIntervalDays":0,"SubtitleFetcherOrder":["SubtitleFetcherOrder","SubtitleFetcherOrder"],"TypeOptions":[{"Type":"Type","MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ImageFetchers":["ImageFetchers","ImageFetchers"],"ImageOptions":[{"Limit":0,"MinWidth":6},{"Limit":0,"MinWidth":6}],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"MetadataFetchers":["MetadataFetchers","MetadataFetchers"]},{"Type":"Type","MetadataFetcherOrder":["MetadataFetcherOrder","MetadataFetcherOrder"],"ImageFetchers":["ImageFetchers","ImageFetchers"],"ImageOptions":[{"Limit":0,"MinWidth":6},{"Limit":0,"MinWidth":6}],"ImageFetcherOrder":["ImageFetcherOrder","ImageFetcherOrder"],"MetadataFetchers":["MetadataFetchers","MetadataFetchers"]}],"EnableRealtimeMonitor":True,"EnableAutomaticSeriesGrouping":True,"ExtractChapterImagesDuringLibraryScan":True,"SubtitleDownloadLanguages":["SubtitleDownloadLanguages","SubtitleDownloadLanguages"],"DisabledLocalMetadataReaders":["DisabledLocalMetadataReaders","DisabledLocalMetadataReaders"],"PreferredMetadataLanguage":"PreferredMetadataLanguage","EnableEmbeddedEpisodeInfos":True,"SkipSubtitlesIfAudioTrackMatches":True,"RequirePerfectSubtitleMatch":True,"EnablePhotos":True,"SkipSubtitlesIfEmbeddedSubtitlesPresent":True,"DisabledSubtitleFetchers":["DisabledSubtitleFetchers","DisabledSubtitleFetchers"],"PathInfos":[{"Path":"Path","NetworkPath":"NetworkPath"},{"Path":"Path","NetworkPath":"NetworkPath"}],"LocalMetadataReaderOrder":["LocalMetadataReaderOrder","LocalMetadataReaderOrder"]},"Id":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders/LibraryOptions',
            method='POST',
            headers=headers,
            data=json.dumps(update_library_options_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_media_path(self):
        """Test case for update_media_path

        Updates a media path.
        """
        media_path_info = {"Path":"Path","NetworkPath":"NetworkPath"}
        query_string = [('name', 'name_example')]
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Library/VirtualFolders/Paths/Update',
            method='POST',
            headers=headers,
            data=json.dumps(media_path_info),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
