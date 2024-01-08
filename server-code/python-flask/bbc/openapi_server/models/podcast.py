from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.category_summary import CategorySummary
from openapi_server.models.image import Image
from openapi_server.models.network_summary import NetworkSummary
from openapi_server.models.podcast_episode_summary import PodcastEpisodeSummary
from openapi_server.models.podcast_synopses import PodcastSynopses
from openapi_server.models.programme_titles import ProgrammeTitles
from openapi_server import util

from openapi_server.models.category_summary import CategorySummary  # noqa: E501
from openapi_server.models.image import Image  # noqa: E501
from openapi_server.models.network_summary import NetworkSummary  # noqa: E501
from openapi_server.models.podcast_episode_summary import PodcastEpisodeSummary  # noqa: E501
from openapi_server.models.podcast_synopses import PodcastSynopses  # noqa: E501
from openapi_server.models.programme_titles import ProgrammeTitles  # noqa: E501

class Podcast(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_summaries=None, days_available=None, entity_type=None, first_published_date=None, frequency=None, images=None, latest_available_episodes=None, network_summary=None, pid=None, rss_url=None, synopses=None, territory=None, titles=None, total_available_episodes=None, type=None, updated_at=None):  # noqa: E501
        """Podcast - a model defined in OpenAPI

        :param category_summaries: The category_summaries of this Podcast.  # noqa: E501
        :type category_summaries: List[CategorySummary]
        :param days_available: The days_available of this Podcast.  # noqa: E501
        :type days_available: int
        :param entity_type: The entity_type of this Podcast.  # noqa: E501
        :type entity_type: str
        :param first_published_date: The first_published_date of this Podcast.  # noqa: E501
        :type first_published_date: str
        :param frequency: The frequency of this Podcast.  # noqa: E501
        :type frequency: str
        :param images: The images of this Podcast.  # noqa: E501
        :type images: List[Image]
        :param latest_available_episodes: The latest_available_episodes of this Podcast.  # noqa: E501
        :type latest_available_episodes: List[PodcastEpisodeSummary]
        :param network_summary: The network_summary of this Podcast.  # noqa: E501
        :type network_summary: NetworkSummary
        :param pid: The pid of this Podcast.  # noqa: E501
        :type pid: str
        :param rss_url: The rss_url of this Podcast.  # noqa: E501
        :type rss_url: str
        :param synopses: The synopses of this Podcast.  # noqa: E501
        :type synopses: PodcastSynopses
        :param territory: The territory of this Podcast.  # noqa: E501
        :type territory: str
        :param titles: The titles of this Podcast.  # noqa: E501
        :type titles: ProgrammeTitles
        :param total_available_episodes: The total_available_episodes of this Podcast.  # noqa: E501
        :type total_available_episodes: int
        :param type: The type of this Podcast.  # noqa: E501
        :type type: str
        :param updated_at: The updated_at of this Podcast.  # noqa: E501
        :type updated_at: str
        """
        self.openapi_types = {
            'category_summaries': List[CategorySummary],
            'days_available': int,
            'entity_type': str,
            'first_published_date': str,
            'frequency': str,
            'images': List[Image],
            'latest_available_episodes': List[PodcastEpisodeSummary],
            'network_summary': NetworkSummary,
            'pid': str,
            'rss_url': str,
            'synopses': PodcastSynopses,
            'territory': str,
            'titles': ProgrammeTitles,
            'total_available_episodes': int,
            'type': str,
            'updated_at': str
        }

        self.attribute_map = {
            'category_summaries': 'category_summaries',
            'days_available': 'days_available',
            'entity_type': 'entity_type',
            'first_published_date': 'first_published_date',
            'frequency': 'frequency',
            'images': 'images',
            'latest_available_episodes': 'latest_available_episodes',
            'network_summary': 'network_summary',
            'pid': 'pid',
            'rss_url': 'rss_url',
            'synopses': 'synopses',
            'territory': 'territory',
            'titles': 'titles',
            'total_available_episodes': 'total_available_episodes',
            'type': 'type',
            'updated_at': 'updated_at'
        }

        self._category_summaries = category_summaries
        self._days_available = days_available
        self._entity_type = entity_type
        self._first_published_date = first_published_date
        self._frequency = frequency
        self._images = images
        self._latest_available_episodes = latest_available_episodes
        self._network_summary = network_summary
        self._pid = pid
        self._rss_url = rss_url
        self._synopses = synopses
        self._territory = territory
        self._titles = titles
        self._total_available_episodes = total_available_episodes
        self._type = type
        self._updated_at = updated_at

    @classmethod
    def from_dict(cls, dikt) -> 'Podcast':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Podcast of this Podcast.  # noqa: E501
        :rtype: Podcast
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_summaries(self) -> List[CategorySummary]:
        """Gets the category_summaries of this Podcast.


        :return: The category_summaries of this Podcast.
        :rtype: List[CategorySummary]
        """
        return self._category_summaries

    @category_summaries.setter
    def category_summaries(self, category_summaries: List[CategorySummary]):
        """Sets the category_summaries of this Podcast.


        :param category_summaries: The category_summaries of this Podcast.
        :type category_summaries: List[CategorySummary]
        """
        if category_summaries is None:
            raise ValueError("Invalid value for `category_summaries`, must not be `None`")  # noqa: E501

        self._category_summaries = category_summaries

    @property
    def days_available(self) -> int:
        """Gets the days_available of this Podcast.


        :return: The days_available of this Podcast.
        :rtype: int
        """
        return self._days_available

    @days_available.setter
    def days_available(self, days_available: int):
        """Sets the days_available of this Podcast.


        :param days_available: The days_available of this Podcast.
        :type days_available: int
        """
        if days_available is None:
            raise ValueError("Invalid value for `days_available`, must not be `None`")  # noqa: E501

        self._days_available = days_available

    @property
    def entity_type(self) -> str:
        """Gets the entity_type of this Podcast.


        :return: The entity_type of this Podcast.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type: str):
        """Sets the entity_type of this Podcast.


        :param entity_type: The entity_type of this Podcast.
        :type entity_type: str
        """
        if entity_type is None:
            raise ValueError("Invalid value for `entity_type`, must not be `None`")  # noqa: E501

        self._entity_type = entity_type

    @property
    def first_published_date(self) -> str:
        """Gets the first_published_date of this Podcast.


        :return: The first_published_date of this Podcast.
        :rtype: str
        """
        return self._first_published_date

    @first_published_date.setter
    def first_published_date(self, first_published_date: str):
        """Sets the first_published_date of this Podcast.


        :param first_published_date: The first_published_date of this Podcast.
        :type first_published_date: str
        """
        if first_published_date is None:
            raise ValueError("Invalid value for `first_published_date`, must not be `None`")  # noqa: E501

        self._first_published_date = first_published_date

    @property
    def frequency(self) -> str:
        """Gets the frequency of this Podcast.


        :return: The frequency of this Podcast.
        :rtype: str
        """
        return self._frequency

    @frequency.setter
    def frequency(self, frequency: str):
        """Sets the frequency of this Podcast.


        :param frequency: The frequency of this Podcast.
        :type frequency: str
        """
        if frequency is None:
            raise ValueError("Invalid value for `frequency`, must not be `None`")  # noqa: E501

        self._frequency = frequency

    @property
    def images(self) -> List[Image]:
        """Gets the images of this Podcast.


        :return: The images of this Podcast.
        :rtype: List[Image]
        """
        return self._images

    @images.setter
    def images(self, images: List[Image]):
        """Sets the images of this Podcast.


        :param images: The images of this Podcast.
        :type images: List[Image]
        """
        if images is None:
            raise ValueError("Invalid value for `images`, must not be `None`")  # noqa: E501

        self._images = images

    @property
    def latest_available_episodes(self) -> List[PodcastEpisodeSummary]:
        """Gets the latest_available_episodes of this Podcast.


        :return: The latest_available_episodes of this Podcast.
        :rtype: List[PodcastEpisodeSummary]
        """
        return self._latest_available_episodes

    @latest_available_episodes.setter
    def latest_available_episodes(self, latest_available_episodes: List[PodcastEpisodeSummary]):
        """Sets the latest_available_episodes of this Podcast.


        :param latest_available_episodes: The latest_available_episodes of this Podcast.
        :type latest_available_episodes: List[PodcastEpisodeSummary]
        """
        if latest_available_episodes is None:
            raise ValueError("Invalid value for `latest_available_episodes`, must not be `None`")  # noqa: E501

        self._latest_available_episodes = latest_available_episodes

    @property
    def network_summary(self) -> NetworkSummary:
        """Gets the network_summary of this Podcast.


        :return: The network_summary of this Podcast.
        :rtype: NetworkSummary
        """
        return self._network_summary

    @network_summary.setter
    def network_summary(self, network_summary: NetworkSummary):
        """Sets the network_summary of this Podcast.


        :param network_summary: The network_summary of this Podcast.
        :type network_summary: NetworkSummary
        """
        if network_summary is None:
            raise ValueError("Invalid value for `network_summary`, must not be `None`")  # noqa: E501

        self._network_summary = network_summary

    @property
    def pid(self) -> str:
        """Gets the pid of this Podcast.


        :return: The pid of this Podcast.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this Podcast.


        :param pid: The pid of this Podcast.
        :type pid: str
        """
        if pid is None:
            raise ValueError("Invalid value for `pid`, must not be `None`")  # noqa: E501

        self._pid = pid

    @property
    def rss_url(self) -> str:
        """Gets the rss_url of this Podcast.


        :return: The rss_url of this Podcast.
        :rtype: str
        """
        return self._rss_url

    @rss_url.setter
    def rss_url(self, rss_url: str):
        """Sets the rss_url of this Podcast.


        :param rss_url: The rss_url of this Podcast.
        :type rss_url: str
        """
        if rss_url is None:
            raise ValueError("Invalid value for `rss_url`, must not be `None`")  # noqa: E501

        self._rss_url = rss_url

    @property
    def synopses(self) -> PodcastSynopses:
        """Gets the synopses of this Podcast.


        :return: The synopses of this Podcast.
        :rtype: PodcastSynopses
        """
        return self._synopses

    @synopses.setter
    def synopses(self, synopses: PodcastSynopses):
        """Sets the synopses of this Podcast.


        :param synopses: The synopses of this Podcast.
        :type synopses: PodcastSynopses
        """
        if synopses is None:
            raise ValueError("Invalid value for `synopses`, must not be `None`")  # noqa: E501

        self._synopses = synopses

    @property
    def territory(self) -> str:
        """Gets the territory of this Podcast.


        :return: The territory of this Podcast.
        :rtype: str
        """
        return self._territory

    @territory.setter
    def territory(self, territory: str):
        """Sets the territory of this Podcast.


        :param territory: The territory of this Podcast.
        :type territory: str
        """
        if territory is None:
            raise ValueError("Invalid value for `territory`, must not be `None`")  # noqa: E501

        self._territory = territory

    @property
    def titles(self) -> ProgrammeTitles:
        """Gets the titles of this Podcast.


        :return: The titles of this Podcast.
        :rtype: ProgrammeTitles
        """
        return self._titles

    @titles.setter
    def titles(self, titles: ProgrammeTitles):
        """Sets the titles of this Podcast.


        :param titles: The titles of this Podcast.
        :type titles: ProgrammeTitles
        """
        if titles is None:
            raise ValueError("Invalid value for `titles`, must not be `None`")  # noqa: E501

        self._titles = titles

    @property
    def total_available_episodes(self) -> int:
        """Gets the total_available_episodes of this Podcast.


        :return: The total_available_episodes of this Podcast.
        :rtype: int
        """
        return self._total_available_episodes

    @total_available_episodes.setter
    def total_available_episodes(self, total_available_episodes: int):
        """Sets the total_available_episodes of this Podcast.


        :param total_available_episodes: The total_available_episodes of this Podcast.
        :type total_available_episodes: int
        """
        if total_available_episodes is None:
            raise ValueError("Invalid value for `total_available_episodes`, must not be `None`")  # noqa: E501

        self._total_available_episodes = total_available_episodes

    @property
    def type(self) -> str:
        """Gets the type of this Podcast.


        :return: The type of this Podcast.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Podcast.


        :param type: The type of this Podcast.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this Podcast.


        :return: The updated_at of this Podcast.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this Podcast.


        :param updated_at: The updated_at of this Podcast.
        :type updated_at: str
        """
        if updated_at is None:
            raise ValueError("Invalid value for `updated_at`, must not be `None`")  # noqa: E501

        self._updated_at = updated_at