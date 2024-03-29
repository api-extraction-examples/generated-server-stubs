from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.available_versions import AvailableVersions
from openapi_server.models.episode_summary import EpisodeSummary
from openapi_server.models.image import Image
from openapi_server.models.network_summary import NetworkSummary
from openapi_server.models.programme_titles import ProgrammeTitles
from openapi_server import util

from openapi_server.models.available_versions import AvailableVersions  # noqa: E501
from openapi_server.models.episode_summary import EpisodeSummary  # noqa: E501
from openapi_server.models.image import Image  # noqa: E501
from openapi_server.models.network_summary import NetworkSummary  # noqa: E501
from openapi_server.models.programme_titles import ProgrammeTitles  # noqa: E501

class BrandSummary(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, available_versions=None, images=None, latest_available_episodes=None, network_summary=None, pid=None, short_synopsis=None, titles=None, total_available_episodes=None, type=None):  # noqa: E501
        """BrandSummary - a model defined in OpenAPI

        :param available_versions: The available_versions of this BrandSummary.  # noqa: E501
        :type available_versions: List[AvailableVersions]
        :param images: The images of this BrandSummary.  # noqa: E501
        :type images: List[Image]
        :param latest_available_episodes: The latest_available_episodes of this BrandSummary.  # noqa: E501
        :type latest_available_episodes: List[EpisodeSummary]
        :param network_summary: The network_summary of this BrandSummary.  # noqa: E501
        :type network_summary: NetworkSummary
        :param pid: The pid of this BrandSummary.  # noqa: E501
        :type pid: str
        :param short_synopsis: The short_synopsis of this BrandSummary.  # noqa: E501
        :type short_synopsis: str
        :param titles: The titles of this BrandSummary.  # noqa: E501
        :type titles: ProgrammeTitles
        :param total_available_episodes: The total_available_episodes of this BrandSummary.  # noqa: E501
        :type total_available_episodes: int
        :param type: The type of this BrandSummary.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'available_versions': List[AvailableVersions],
            'images': List[Image],
            'latest_available_episodes': List[EpisodeSummary],
            'network_summary': NetworkSummary,
            'pid': str,
            'short_synopsis': str,
            'titles': ProgrammeTitles,
            'total_available_episodes': int,
            'type': str
        }

        self.attribute_map = {
            'available_versions': 'available_versions',
            'images': 'images',
            'latest_available_episodes': 'latest_available_episodes',
            'network_summary': 'network_summary',
            'pid': 'pid',
            'short_synopsis': 'short_synopsis',
            'titles': 'titles',
            'total_available_episodes': 'total_available_episodes',
            'type': 'type'
        }

        self._available_versions = available_versions
        self._images = images
        self._latest_available_episodes = latest_available_episodes
        self._network_summary = network_summary
        self._pid = pid
        self._short_synopsis = short_synopsis
        self._titles = titles
        self._total_available_episodes = total_available_episodes
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BrandSummary':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BrandSummary of this BrandSummary.  # noqa: E501
        :rtype: BrandSummary
        """
        return util.deserialize_model(dikt, cls)

    @property
    def available_versions(self) -> List[AvailableVersions]:
        """Gets the available_versions of this BrandSummary.


        :return: The available_versions of this BrandSummary.
        :rtype: List[AvailableVersions]
        """
        return self._available_versions

    @available_versions.setter
    def available_versions(self, available_versions: List[AvailableVersions]):
        """Sets the available_versions of this BrandSummary.


        :param available_versions: The available_versions of this BrandSummary.
        :type available_versions: List[AvailableVersions]
        """

        self._available_versions = available_versions

    @property
    def images(self) -> List[Image]:
        """Gets the images of this BrandSummary.


        :return: The images of this BrandSummary.
        :rtype: List[Image]
        """
        return self._images

    @images.setter
    def images(self, images: List[Image]):
        """Sets the images of this BrandSummary.


        :param images: The images of this BrandSummary.
        :type images: List[Image]
        """
        if images is None:
            raise ValueError("Invalid value for `images`, must not be `None`")  # noqa: E501

        self._images = images

    @property
    def latest_available_episodes(self) -> List[EpisodeSummary]:
        """Gets the latest_available_episodes of this BrandSummary.


        :return: The latest_available_episodes of this BrandSummary.
        :rtype: List[EpisodeSummary]
        """
        return self._latest_available_episodes

    @latest_available_episodes.setter
    def latest_available_episodes(self, latest_available_episodes: List[EpisodeSummary]):
        """Sets the latest_available_episodes of this BrandSummary.


        :param latest_available_episodes: The latest_available_episodes of this BrandSummary.
        :type latest_available_episodes: List[EpisodeSummary]
        """
        if latest_available_episodes is None:
            raise ValueError("Invalid value for `latest_available_episodes`, must not be `None`")  # noqa: E501

        self._latest_available_episodes = latest_available_episodes

    @property
    def network_summary(self) -> NetworkSummary:
        """Gets the network_summary of this BrandSummary.


        :return: The network_summary of this BrandSummary.
        :rtype: NetworkSummary
        """
        return self._network_summary

    @network_summary.setter
    def network_summary(self, network_summary: NetworkSummary):
        """Sets the network_summary of this BrandSummary.


        :param network_summary: The network_summary of this BrandSummary.
        :type network_summary: NetworkSummary
        """
        if network_summary is None:
            raise ValueError("Invalid value for `network_summary`, must not be `None`")  # noqa: E501

        self._network_summary = network_summary

    @property
    def pid(self) -> str:
        """Gets the pid of this BrandSummary.


        :return: The pid of this BrandSummary.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this BrandSummary.


        :param pid: The pid of this BrandSummary.
        :type pid: str
        """
        if pid is None:
            raise ValueError("Invalid value for `pid`, must not be `None`")  # noqa: E501

        self._pid = pid

    @property
    def short_synopsis(self) -> str:
        """Gets the short_synopsis of this BrandSummary.


        :return: The short_synopsis of this BrandSummary.
        :rtype: str
        """
        return self._short_synopsis

    @short_synopsis.setter
    def short_synopsis(self, short_synopsis: str):
        """Sets the short_synopsis of this BrandSummary.


        :param short_synopsis: The short_synopsis of this BrandSummary.
        :type short_synopsis: str
        """
        if short_synopsis is None:
            raise ValueError("Invalid value for `short_synopsis`, must not be `None`")  # noqa: E501

        self._short_synopsis = short_synopsis

    @property
    def titles(self) -> ProgrammeTitles:
        """Gets the titles of this BrandSummary.


        :return: The titles of this BrandSummary.
        :rtype: ProgrammeTitles
        """
        return self._titles

    @titles.setter
    def titles(self, titles: ProgrammeTitles):
        """Sets the titles of this BrandSummary.


        :param titles: The titles of this BrandSummary.
        :type titles: ProgrammeTitles
        """
        if titles is None:
            raise ValueError("Invalid value for `titles`, must not be `None`")  # noqa: E501

        self._titles = titles

    @property
    def total_available_episodes(self) -> int:
        """Gets the total_available_episodes of this BrandSummary.


        :return: The total_available_episodes of this BrandSummary.
        :rtype: int
        """
        return self._total_available_episodes

    @total_available_episodes.setter
    def total_available_episodes(self, total_available_episodes: int):
        """Sets the total_available_episodes of this BrandSummary.


        :param total_available_episodes: The total_available_episodes of this BrandSummary.
        :type total_available_episodes: int
        """
        if total_available_episodes is None:
            raise ValueError("Invalid value for `total_available_episodes`, must not be `None`")  # noqa: E501

        self._total_available_episodes = total_available_episodes

    @property
    def type(self) -> str:
        """Gets the type of this BrandSummary.


        :return: The type of this BrandSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BrandSummary.


        :param type: The type of this BrandSummary.
        :type type: str
        """
        allowed_values = ["brand_summary"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
