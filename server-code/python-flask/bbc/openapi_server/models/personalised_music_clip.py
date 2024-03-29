from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.personalised_music_clip_parent_programme import PersonalisedMusicClipParentProgramme
from openapi_server.models.personalised_music_version import PersonalisedMusicVersion
from openapi_server import util

from openapi_server.models.personalised_music_clip_parent_programme import PersonalisedMusicClipParentProgramme  # noqa: E501
from openapi_server.models.personalised_music_version import PersonalisedMusicVersion  # noqa: E501

class PersonalisedMusicClip(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, contributors=None, end_date=None, entity_type=None, image_url=None, masterbrand_mid=None, media_type=None, parent_programme=None, pid=None, start_date=None, synopsis=None, title=None, version=None):  # noqa: E501
        """PersonalisedMusicClip - a model defined in OpenAPI

        :param contributors: The contributors of this PersonalisedMusicClip.  # noqa: E501
        :type contributors: List[str]
        :param end_date: The end_date of this PersonalisedMusicClip.  # noqa: E501
        :type end_date: str
        :param entity_type: The entity_type of this PersonalisedMusicClip.  # noqa: E501
        :type entity_type: str
        :param image_url: The image_url of this PersonalisedMusicClip.  # noqa: E501
        :type image_url: str
        :param masterbrand_mid: The masterbrand_mid of this PersonalisedMusicClip.  # noqa: E501
        :type masterbrand_mid: str
        :param media_type: The media_type of this PersonalisedMusicClip.  # noqa: E501
        :type media_type: str
        :param parent_programme: The parent_programme of this PersonalisedMusicClip.  # noqa: E501
        :type parent_programme: PersonalisedMusicClipParentProgramme
        :param pid: The pid of this PersonalisedMusicClip.  # noqa: E501
        :type pid: str
        :param start_date: The start_date of this PersonalisedMusicClip.  # noqa: E501
        :type start_date: str
        :param synopsis: The synopsis of this PersonalisedMusicClip.  # noqa: E501
        :type synopsis: str
        :param title: The title of this PersonalisedMusicClip.  # noqa: E501
        :type title: str
        :param version: The version of this PersonalisedMusicClip.  # noqa: E501
        :type version: PersonalisedMusicVersion
        """
        self.openapi_types = {
            'contributors': List[str],
            'end_date': str,
            'entity_type': str,
            'image_url': str,
            'masterbrand_mid': str,
            'media_type': str,
            'parent_programme': PersonalisedMusicClipParentProgramme,
            'pid': str,
            'start_date': str,
            'synopsis': str,
            'title': str,
            'version': PersonalisedMusicVersion
        }

        self.attribute_map = {
            'contributors': 'contributors',
            'end_date': 'endDate',
            'entity_type': 'entityType',
            'image_url': 'imageUrl',
            'masterbrand_mid': 'masterbrandMid',
            'media_type': 'mediaType',
            'parent_programme': 'parentProgramme',
            'pid': 'pid',
            'start_date': 'startDate',
            'synopsis': 'synopsis',
            'title': 'title',
            'version': 'version'
        }

        self._contributors = contributors
        self._end_date = end_date
        self._entity_type = entity_type
        self._image_url = image_url
        self._masterbrand_mid = masterbrand_mid
        self._media_type = media_type
        self._parent_programme = parent_programme
        self._pid = pid
        self._start_date = start_date
        self._synopsis = synopsis
        self._title = title
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicClip':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicClip of this PersonalisedMusicClip.  # noqa: E501
        :rtype: PersonalisedMusicClip
        """
        return util.deserialize_model(dikt, cls)

    @property
    def contributors(self) -> List[str]:
        """Gets the contributors of this PersonalisedMusicClip.


        :return: The contributors of this PersonalisedMusicClip.
        :rtype: List[str]
        """
        return self._contributors

    @contributors.setter
    def contributors(self, contributors: List[str]):
        """Sets the contributors of this PersonalisedMusicClip.


        :param contributors: The contributors of this PersonalisedMusicClip.
        :type contributors: List[str]
        """

        self._contributors = contributors

    @property
    def end_date(self) -> str:
        """Gets the end_date of this PersonalisedMusicClip.


        :return: The end_date of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: str):
        """Sets the end_date of this PersonalisedMusicClip.


        :param end_date: The end_date of this PersonalisedMusicClip.
        :type end_date: str
        """

        self._end_date = end_date

    @property
    def entity_type(self) -> str:
        """Gets the entity_type of this PersonalisedMusicClip.


        :return: The entity_type of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type: str):
        """Sets the entity_type of this PersonalisedMusicClip.


        :param entity_type: The entity_type of this PersonalisedMusicClip.
        :type entity_type: str
        """

        self._entity_type = entity_type

    @property
    def image_url(self) -> str:
        """Gets the image_url of this PersonalisedMusicClip.


        :return: The image_url of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._image_url

    @image_url.setter
    def image_url(self, image_url: str):
        """Sets the image_url of this PersonalisedMusicClip.


        :param image_url: The image_url of this PersonalisedMusicClip.
        :type image_url: str
        """

        self._image_url = image_url

    @property
    def masterbrand_mid(self) -> str:
        """Gets the masterbrand_mid of this PersonalisedMusicClip.


        :return: The masterbrand_mid of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._masterbrand_mid

    @masterbrand_mid.setter
    def masterbrand_mid(self, masterbrand_mid: str):
        """Sets the masterbrand_mid of this PersonalisedMusicClip.


        :param masterbrand_mid: The masterbrand_mid of this PersonalisedMusicClip.
        :type masterbrand_mid: str
        """

        self._masterbrand_mid = masterbrand_mid

    @property
    def media_type(self) -> str:
        """Gets the media_type of this PersonalisedMusicClip.


        :return: The media_type of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._media_type

    @media_type.setter
    def media_type(self, media_type: str):
        """Sets the media_type of this PersonalisedMusicClip.


        :param media_type: The media_type of this PersonalisedMusicClip.
        :type media_type: str
        """

        self._media_type = media_type

    @property
    def parent_programme(self) -> PersonalisedMusicClipParentProgramme:
        """Gets the parent_programme of this PersonalisedMusicClip.


        :return: The parent_programme of this PersonalisedMusicClip.
        :rtype: PersonalisedMusicClipParentProgramme
        """
        return self._parent_programme

    @parent_programme.setter
    def parent_programme(self, parent_programme: PersonalisedMusicClipParentProgramme):
        """Sets the parent_programme of this PersonalisedMusicClip.


        :param parent_programme: The parent_programme of this PersonalisedMusicClip.
        :type parent_programme: PersonalisedMusicClipParentProgramme
        """

        self._parent_programme = parent_programme

    @property
    def pid(self) -> str:
        """Gets the pid of this PersonalisedMusicClip.


        :return: The pid of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this PersonalisedMusicClip.


        :param pid: The pid of this PersonalisedMusicClip.
        :type pid: str
        """

        self._pid = pid

    @property
    def start_date(self) -> str:
        """Gets the start_date of this PersonalisedMusicClip.


        :return: The start_date of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this PersonalisedMusicClip.


        :param start_date: The start_date of this PersonalisedMusicClip.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def synopsis(self) -> str:
        """Gets the synopsis of this PersonalisedMusicClip.


        :return: The synopsis of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._synopsis

    @synopsis.setter
    def synopsis(self, synopsis: str):
        """Sets the synopsis of this PersonalisedMusicClip.


        :param synopsis: The synopsis of this PersonalisedMusicClip.
        :type synopsis: str
        """

        self._synopsis = synopsis

    @property
    def title(self) -> str:
        """Gets the title of this PersonalisedMusicClip.


        :return: The title of this PersonalisedMusicClip.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this PersonalisedMusicClip.


        :param title: The title of this PersonalisedMusicClip.
        :type title: str
        """

        self._title = title

    @property
    def version(self) -> PersonalisedMusicVersion:
        """Gets the version of this PersonalisedMusicClip.


        :return: The version of this PersonalisedMusicClip.
        :rtype: PersonalisedMusicVersion
        """
        return self._version

    @version.setter
    def version(self, version: PersonalisedMusicVersion):
        """Sets the version of this PersonalisedMusicClip.


        :param version: The version of this PersonalisedMusicClip.
        :type version: PersonalisedMusicVersion
        """

        self._version = version
