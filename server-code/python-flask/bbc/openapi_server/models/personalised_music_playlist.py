from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.personalised_music_image import PersonalisedMusicImage
from openapi_server.models.personalised_music_playlist_version import PersonalisedMusicPlaylistVersion
from openapi_server.models.personalised_music_track import PersonalisedMusicTrack
from openapi_server import util

from openapi_server.models.personalised_music_image import PersonalisedMusicImage  # noqa: E501
from openapi_server.models.personalised_music_playlist_version import PersonalisedMusicPlaylistVersion  # noqa: E501
from openapi_server.models.personalised_music_track import PersonalisedMusicTrack  # noqa: E501

class PersonalisedMusicPlaylist(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, images=None, playback_type=None, service_id=None, title=None, tracks=None, type=None, updated_at=None, version=None):  # noqa: E501
        """PersonalisedMusicPlaylist - a model defined in OpenAPI

        :param description: The description of this PersonalisedMusicPlaylist.  # noqa: E501
        :type description: str
        :param images: The images of this PersonalisedMusicPlaylist.  # noqa: E501
        :type images: List[PersonalisedMusicImage]
        :param playback_type: The playback_type of this PersonalisedMusicPlaylist.  # noqa: E501
        :type playback_type: str
        :param service_id: The service_id of this PersonalisedMusicPlaylist.  # noqa: E501
        :type service_id: str
        :param title: The title of this PersonalisedMusicPlaylist.  # noqa: E501
        :type title: str
        :param tracks: The tracks of this PersonalisedMusicPlaylist.  # noqa: E501
        :type tracks: PersonalisedMusicTrack
        :param type: The type of this PersonalisedMusicPlaylist.  # noqa: E501
        :type type: str
        :param updated_at: The updated_at of this PersonalisedMusicPlaylist.  # noqa: E501
        :type updated_at: str
        :param version: The version of this PersonalisedMusicPlaylist.  # noqa: E501
        :type version: PersonalisedMusicPlaylistVersion
        """
        self.openapi_types = {
            'description': str,
            'images': List[PersonalisedMusicImage],
            'playback_type': str,
            'service_id': str,
            'title': str,
            'tracks': PersonalisedMusicTrack,
            'type': str,
            'updated_at': str,
            'version': PersonalisedMusicPlaylistVersion
        }

        self.attribute_map = {
            'description': 'description',
            'images': 'images',
            'playback_type': 'playback_type',
            'service_id': 'service_id',
            'title': 'title',
            'tracks': 'tracks',
            'type': 'type',
            'updated_at': 'updated_at',
            'version': 'version'
        }

        self._description = description
        self._images = images
        self._playback_type = playback_type
        self._service_id = service_id
        self._title = title
        self._tracks = tracks
        self._type = type
        self._updated_at = updated_at
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicPlaylist':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicPlaylist of this PersonalisedMusicPlaylist.  # noqa: E501
        :rtype: PersonalisedMusicPlaylist
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this PersonalisedMusicPlaylist.


        :return: The description of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this PersonalisedMusicPlaylist.


        :param description: The description of this PersonalisedMusicPlaylist.
        :type description: str
        """

        self._description = description

    @property
    def images(self) -> List[PersonalisedMusicImage]:
        """Gets the images of this PersonalisedMusicPlaylist.


        :return: The images of this PersonalisedMusicPlaylist.
        :rtype: List[PersonalisedMusicImage]
        """
        return self._images

    @images.setter
    def images(self, images: List[PersonalisedMusicImage]):
        """Sets the images of this PersonalisedMusicPlaylist.


        :param images: The images of this PersonalisedMusicPlaylist.
        :type images: List[PersonalisedMusicImage]
        """

        self._images = images

    @property
    def playback_type(self) -> str:
        """Gets the playback_type of this PersonalisedMusicPlaylist.


        :return: The playback_type of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._playback_type

    @playback_type.setter
    def playback_type(self, playback_type: str):
        """Sets the playback_type of this PersonalisedMusicPlaylist.


        :param playback_type: The playback_type of this PersonalisedMusicPlaylist.
        :type playback_type: str
        """

        self._playback_type = playback_type

    @property
    def service_id(self) -> str:
        """Gets the service_id of this PersonalisedMusicPlaylist.


        :return: The service_id of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._service_id

    @service_id.setter
    def service_id(self, service_id: str):
        """Sets the service_id of this PersonalisedMusicPlaylist.


        :param service_id: The service_id of this PersonalisedMusicPlaylist.
        :type service_id: str
        """

        self._service_id = service_id

    @property
    def title(self) -> str:
        """Gets the title of this PersonalisedMusicPlaylist.


        :return: The title of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PersonalisedMusicPlaylist.


        :param title: The title of this PersonalisedMusicPlaylist.
        :type title: str
        """

        self._title = title

    @property
    def tracks(self) -> PersonalisedMusicTrack:
        """Gets the tracks of this PersonalisedMusicPlaylist.


        :return: The tracks of this PersonalisedMusicPlaylist.
        :rtype: PersonalisedMusicTrack
        """
        return self._tracks

    @tracks.setter
    def tracks(self, tracks: PersonalisedMusicTrack):
        """Sets the tracks of this PersonalisedMusicPlaylist.


        :param tracks: The tracks of this PersonalisedMusicPlaylist.
        :type tracks: PersonalisedMusicTrack
        """

        self._tracks = tracks

    @property
    def type(self) -> str:
        """Gets the type of this PersonalisedMusicPlaylist.


        :return: The type of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PersonalisedMusicPlaylist.


        :param type: The type of this PersonalisedMusicPlaylist.
        :type type: str
        """

        self._type = type

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this PersonalisedMusicPlaylist.


        :return: The updated_at of this PersonalisedMusicPlaylist.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this PersonalisedMusicPlaylist.


        :param updated_at: The updated_at of this PersonalisedMusicPlaylist.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def version(self) -> PersonalisedMusicPlaylistVersion:
        """Gets the version of this PersonalisedMusicPlaylist.


        :return: The version of this PersonalisedMusicPlaylist.
        :rtype: PersonalisedMusicPlaylistVersion
        """
        return self._version

    @version.setter
    def version(self, version: PersonalisedMusicPlaylistVersion):
        """Sets the version of this PersonalisedMusicPlaylist.


        :param version: The version of this PersonalisedMusicPlaylist.
        :type version: PersonalisedMusicPlaylistVersion
        """

        self._version = version
